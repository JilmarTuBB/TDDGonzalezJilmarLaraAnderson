
package p3tarea3grupo3.model;

import p3tarea3grupo3.controller.designpattern.singleton.ConnectionMongo;
import p3tarea3grupo3.controller.*;
import com.mongodb.client.MongoCollection;
import javax.swing.JOptionPane;
import org.bson.Document;


public class CreateMongo {
    
    ConnectionMongo connection;
    MongoCollection<Document> collection;
    
    
    public CreateMongo( ){        
        this.connection = ConnectionMongo.connect();
        this.collection = connection.getCollection();
    }
    
    public void addDocument(Document document){
        collection.insertOne(document);
        JOptionPane.showMessageDialog(null, "Registro Completo", "INFORMATION",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
