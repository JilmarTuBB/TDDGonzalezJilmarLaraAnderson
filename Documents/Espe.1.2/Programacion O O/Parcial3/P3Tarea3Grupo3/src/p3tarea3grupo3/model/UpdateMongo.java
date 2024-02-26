
package p3tarea3grupo3.model;

import com.mongodb.client.MongoCollection;
import javax.swing.JOptionPane;
import org.bson.Document;

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
