
package p3tarea3grupo3.model;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.List;
import org.bson.Document;

public class ReadMongo {
    
    ConnectionMongo connection;
    MongoCollection<Document> collection;
    List<Document> listDocument;
    Document document;
    
    
    public ReadMongo(String nameCollection){        
        this.connection = ConnectionMongo.connect(nameCollection);
        this.collection = connection.getCollection();
    }
    
    public List<Document> readDocument() {
        MongoCursor cursor = collection.find().iterator();
        while(cursor.hasNext()) {
            Document document = (Document) cursor.next();
            listDocument.add(document);
        }
        return listDocument;
    }
    
    public Document readDocument(String camp, String value) {
        Document query = new Document(camp,value);
        MongoCursor cursor = collection.find(query).iterator();      
        while(cursor.hasNext()) {
            document = (Document) cursor.next();
        }
        return document;
    }
    
}