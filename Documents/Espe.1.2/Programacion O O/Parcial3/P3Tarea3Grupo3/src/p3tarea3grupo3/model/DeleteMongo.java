
package p3tarea3grupo3.model;

import p3tarea3grupo3.controller.designpattern.singleton.ConnectionMongo;
import com.mongodb.client.MongoCollection;
import org.bson.Document;


// Clase que se encarga de eliminar documentos de MongoDB
public class DeleteMongo {
    MongoCollection<Document> collection; // Colección en la base de datos
    
    // Constructor por defecto
    public DeleteMongo(){
        
    }
    
    // Metodo para eliminar un documento de la coleccion
    public void deleteDocument(Document d){
        // Obtiene la instancia de conexion a MongoDB
        ConnectionMongo connection  = ConnectionMongo.connect();
        // Obtiene la coleccion de la conexion
        collection = connection.getCollection();
        // Elimina el documento de la coleccion
        collection.deleteOne(d);
    }
}
