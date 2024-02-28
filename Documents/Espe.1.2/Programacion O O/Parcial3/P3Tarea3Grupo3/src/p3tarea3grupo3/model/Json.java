
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

    public Json(Client client) {
        this.client = client;
    }

    public Json() {
    }
    
    public Client getClient() {
        File file = new File("Register.json");
        if(!file.exists()){
            return null;
        }
        try(BufferedReader read = new BufferedReader(new FileReader("Register.json"))) {
            Gson gson = new Gson();
            client = gson.fromJson(read,Client.class);          
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No existe el archivo");
        }
        return client;
    }

    public void setClient(Client client) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Register.json"))){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String listS = gson.toJson(client);
            writer.write(listS);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo guardar el registro");
        }
    }
        
}
