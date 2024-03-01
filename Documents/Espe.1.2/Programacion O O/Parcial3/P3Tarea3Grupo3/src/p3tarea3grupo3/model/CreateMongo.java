
package p3tarea3grupo3.model;

import p3tarea3grupo3.controller.designpattern.singleton.ConnectionMongo;
import com.mongodb.client.MongoCollection;
import javax.swing.JOptionPane;
import org.bson.Document;

// Clase que se encarga de crear documentos en MongoDB
public class CreateMongo {
    
    ConnectionMongo connection; // Instancia de conexion a MongoDB
    MongoCollection<Document> collection; // Coleccion en la base de datos
    
    // Constructor que inicializa la conexión y la colección
    public CreateMongo() {        
        this.connection = ConnectionMongo.connect(); // Obtiene la instancia unica de conexion
        this.collection = connection.getCollection(); // Obtiene la coleccion de la conexion
    }
    
    // Metodo para añadir un nuevo documento a la coleccion
    public void addDocument(Document document) {
        collection.insertOne(document); // Inserta el documento en la coleccion
        // Muestra un mensaje de confirmacion
        JOptionPane.showMessageDialog(null, "Registro Completo", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }
}

