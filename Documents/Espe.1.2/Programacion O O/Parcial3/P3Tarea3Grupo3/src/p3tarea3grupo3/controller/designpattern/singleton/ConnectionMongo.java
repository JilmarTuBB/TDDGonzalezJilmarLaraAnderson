
package p3tarea3grupo3.controller.designpattern.singleton;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;

// Clase que implementa el patron Singleton para manejar la conexion a MongoDB
public class ConnectionMongo {
    
    public static ConnectionMongo connection; // Instancia unica de la conexión
    private MongoClient mongo; // Cliente MongoDB
    private MongoDatabase dataBase; // Base de datos MongoDB
    MongoCollection<Document> collection; // Coleccion MongoDB
    String server = "localhost"; // Servidor MongoDB
    int puerto = 27017; // Puerto MongoDB
    
    // Constructor privado para evitar la creacion de instancias directas
    private ConnectionMongo(){
       this.mongo = createConnection(); // Establece la conexion MongoDB
       this.dataBase = mongo.getDatabase("P3Tarea3Grupo3"); // Obtiene la base de datos
       this.collection = dataBase.getCollection("Account"); // Obtiene la coleccion
    }
    
    // Metodo privado para crear la conexion MongoDB
    private MongoClient createConnection(){
        try{
            mongo = new MongoClient(server, puerto); // Crea la conexion
        }catch(MongoException e){
            JOptionPane.showMessageDialog(null, "Error al crear la conexión", "ERROR", JOptionPane.ERROR_MESSAGE); // Manejo de excepciones
        }
        return mongo; // Devuelve el cliente MongoDB
    }

    // Metodo estatico para obtener la instancia única de la conexion y aplicamos el patron de diseño creacional Singleton
    public static ConnectionMongo connect(){
        if(connection == null){
            connection = new ConnectionMongo(); // Si no existe una instancia, se crea una nueva
        }
        return connection; // Devuelve la instancia existente
    }
    
    // Metodo para obtener la colección MongoDB
    public MongoCollection<Document> getCollection() {
        return collection;
    }
}
