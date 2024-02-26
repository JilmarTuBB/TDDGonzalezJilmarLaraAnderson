/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3tarea3grupo3.model;

import p3tarea3grupo3.controller.*;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author HOME
 */
public class DeleteMongo {
    MongoCollection<Document> collection;
    
    public DeleteMongo(){
        
    }
    
    public void deleteDocument(Document d, String nameCollection){
        ConnectionMongo connection  = ConnectionMongo.connect(nameCollection);
        collection = connection.getCollection();
        collection.deleteOne(d);
    }
}
