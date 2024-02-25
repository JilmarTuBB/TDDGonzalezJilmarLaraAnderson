/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3tarea3grupo3.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author HOME
 */
public class ConnectionMongo {
    public static ConnectionMongo connection;
    MongoClient mongo;
    MongoDatabase dataBase;
    MongoCollection<Document> collection;
    String server = "localhost";
    int puerto = 27017;
    
    private ConnectionMongo(String nameCollection){
       this.mongo = createConnection();
       this.dataBase = mongo.getDatabase("P3Tarea3Grupo3");
       this.collection = dataBase.getCollection(nameCollection);
    }
    public MongoClient createConnection(){
        try{
            mongo = new MongoClient(server, puerto);
        }catch(MongoException e){
            JOptionPane.showMessageDialog(null, "Error al crear la conexion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return mongo;
    }

    public MongoCollection<Document> getCollection() {
        return collection;
    }
    
    public static ConnectionMongo connect(String nameCollection){
        if(connection == null){
            connection = new ConnectionMongo(nameCollection); //Aqui realizo la instancia de mi clase conexion    
        }
        return connection;
    }
}
