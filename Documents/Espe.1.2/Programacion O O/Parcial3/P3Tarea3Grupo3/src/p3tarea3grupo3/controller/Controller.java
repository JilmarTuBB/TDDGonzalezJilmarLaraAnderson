
package p3tarea3grupo3.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import p3tarea3grupo3.model.ConnectionMongo;
import p3tarea3grupo3.model.ReadMongo;

public class Controller {
    
    ConnectionMongo connection;
    MongoCollection<Document> collection;

    public Controller(String nameCollection) {
        this.connection = ConnectionMongo.connect(nameCollection);
        this.collection = connection.getCollection();
    }
    
    public boolean verifyUser(String camp, String value) {
        Document query = new Document(camp,value);
        MongoCursor<Document> cursor = collection.find(query).iterator();
        if(cursor.hasNext()) {
            return true;
        }
        return false;
    }
}
