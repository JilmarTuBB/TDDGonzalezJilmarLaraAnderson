
package p3tarea3grupo3.model;

import p3tarea3grupo3.controller.designpattern.singleton.ConnectionMongo;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

// Clase que se encarga de leer documentos de MongoDB
public class ReadMongo {
    
    ConnectionMongo connection; 
    MongoCollection<Document> collection; 
    List<Document> listDocument; // Lista para almacenar documentos leidos
    Document document; 
    
    // Constructor que inicializa la conexión y la lista de documentos
    public ReadMongo(){        
        this.connection = ConnectionMongo.connect(); // Obtiene la instancia unica de conexion
        this.collection = connection.getCollection(); // Obtiene la coleccion de la conexion
        this.listDocument = new ArrayList(); // Inicializa la lista de documentos
    }
    
    // Metodo para leer todos los documentos de la colección
    public List<Document> readDocument() {
        // Itera sobre los documentos de la coleccion y los añade a la lista
        MongoCursor cursor = collection.find().iterator();
        while(cursor.hasNext()) {
            Document document = (Document) cursor.next();
            listDocument.add(document);
        }
        return listDocument; // Devuelve la lista de documentos leidos
    }
    
    // Metodo para leer un documento especifico de la coleccion
    public Document readDocument(String camp, String value) {
        // Crea un documento de consulta con el campo y el valor especificados
        Document query = new Document(camp,value);
        // Realiza la consulta en la coleccion y obtiene el primer documento coincidente
        MongoCursor cursor = collection.find(query).iterator();      
        while(cursor.hasNext()) {
            document = (Document) cursor.next();
        }
        return document; // Devuelve el documento leido
    }
}
