
package p3tarea3grupo3.model;

import p3tarea3grupo3.controller.designpattern.singleton.ConnectionMongo;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

// Clase que se encarga de actualizar documentos de MongoDB
public class UpdateMongo {
   
    MongoCollection<Document> collection; // Coleccion en la base de datos
    
    // Constructor por defecto
    public UpdateMongo(){        
    }
    
    // Metodo para actualizar un documento en la coleccion
    public void updateDocument(Document before, Document end){
        // Obtiene la instancia de conexion a MongoDB
        ConnectionMongo connection = ConnectionMongo.connect();
        // Obtiene la coleccion de la conexion
        collection = connection.getCollection();   
        // Crea un documento de actualizacion con los nuevos valores
        Document update = new Document("$set", new Document(end));
        // Actualiza el documento en la coleccion
        collection.updateOne(before, update);       
    }
}

