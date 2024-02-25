/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3tarea3grupo3.controller;

import com.mongodb.client.MongoCollection;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author HOME
 */
public class UpdateMongo {
    MongoCollection<Document> collection;
    
    public UpdateMongo(){
        
    }
    
    public void modifyDocument(String nameCollection, Document before, Document end){
        ConnectionMongo connection = ConnectionMongo.connect(nameCollection);
        collection = connection.getCollection();
        
        Document update = new Document("$set", new Document(end));
        collection.updateOne(before, update);
        JOptionPane.showMessageDialog(null,"Datos actualizados");
    }
}
