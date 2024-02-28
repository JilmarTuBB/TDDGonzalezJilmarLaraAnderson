
package p3tarea3grupo3.controller.designpattern.singleton;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;

public class ConnectionMongo {
    
    public static ConnectionMongo connection;
    private MongoClient mongo;
    private MongoDatabase dataBase;
    MongoCollection<Document> collection;
    String server = "localhost";
    int puerto = 27017;
    
    private ConnectionMongo(){
       this.mongo = createConnection();
       this.dataBase = mongo.getDatabase("P3Tarea3Grupo3");
       this.collection = dataBase.getCollection("Account");
    }
    
    private MongoClient createConnection(){
        try{
            mongo = new MongoClient(server, puerto);
        }catch(MongoException e){
            JOptionPane.showMessageDialog(null, "Error al crear la conexion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return mongo;
    }

    public static ConnectionMongo connect(){
        if(connection == null){
            connection = new ConnectionMongo();    
        }
        return connection;
    }
    
    public MongoCollection<Document> getCollection() {
        return collection;
    }
}
