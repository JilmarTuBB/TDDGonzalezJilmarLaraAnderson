
package p3tarea3grupo3.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import p3tarea3grupo3.controller.Client;

public class Json {   
    
    private Client client; 
   
    // Constructor con un cliente proporcionado
    public Json(Client client) {
        this.client = client;
    }

    // Constructor VACIO
    public Json() {
    }   
    // MEtodo para obtener el cliente desde un archivo JSON
    public Client getClient() {
        // Verifica si el archivo JSON existe
        File file = new File("Register.json");
        if(!file.exists()){
            return null; // Retorna nulo si el archivo no existe
        }
        try(BufferedReader read = new BufferedReader(new FileReader("Register.json"))) {
            Gson gson = new Gson();
            // Lee el contenido del archivo JSON y lo convierte a un objeto Client
            client = gson.fromJson(read,Client.class);          
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No existe el archivo"); // Muestra un mensaje de error si falla la lectura del archivo
        }
        return client; // Retorna el cliente leído desde el archivo JSON
    }
    // Metodo para guardar un cliente en un archivo JSON
    public void setClient(Client client) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Register.json"))){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            // Convierte el objeto Client a formato JSON y lo guarda en el archivo
            String listS = gson.toJson(client);
            writer.write(listS); // Escribe el JSON en el archivo
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo guardar el registro"); // Muestra un mensaje de error si falla la escritura en el archivo
        }
    }  
}

  