
package p3tarea3grupo3.model;

import p3tarea3grupo3.controller.designpattern.singleton.ConnectionMongo;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class UpdateMongo {
   
    MongoCollection<Document> collection;
    
    public UpdateMongo(){        
    }
    
    public void updateDocument(Document before, Document end){
        ConnectionMongo connection = ConnectionMongo.connect();
        collection = connection.getCollection();   
        Document update = new Document("$set", new Document(end));
        collection.updateOne(before, update);       
    }
}
