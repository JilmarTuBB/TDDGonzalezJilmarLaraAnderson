
package p3tarea3grupo3.model;

import p3tarea3grupo3.controller.*;
import com.mongodb.client.MongoCollection;
import org.bson.Document;


public class CreateMongo {
    
    ConnectionMongo connection;
    MongoCollection<Document> collection;
    
    
    public CreateMongo(String nameCollection){        
        this.connection = ConnectionMongo.connect(nameCollection);
        this.collection = connection.getCollection();
    }
    
    public void addDocument(Document document){
        collection.insertOne(document);
    }
    
}
