
package p3tarea3grupo3.controller;
//Importaciones de librerias
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import p3tarea3grupo3.model.ReadMongo;

//Clase que controla la gestion de la lista de cuentas de clientes en el sistema bancario
public class ListClient {

    public static ListClient client; //Atributo stático

    ReadMongo readMongo; //atributo para leer la BD
    Account account; //objeto de tipo Account
    List<Account> listAccount; //Lista de cuentas
    
    //Constructor

    private ListClient() {
        readMongo = new ReadMongo();
        account = new Account();
    }
    
    //Implementacion del patron creacional Singleton 
    /*
    Devuelve la única instancia de la clase ListClient.
    Si la instancia aún no ha sido creada, se crea una nueva instancia
    de lo contrario, se devuelve la instancia existente.
    */
    public static ListClient getInstance(){
        if(client == null){
            client = new ListClient();
        }
        return client;
    }
    
    //Este metodo devuelve una lista de cuentas de clientes
    public List<Account> getAccount() {
        listAccount = new ArrayList();
        List<Document> listDoc = readMongo.readDocument();
        for (Document doc : listDoc) {
            Account acc = account.getObject(doc);
            listAccount.add(acc);
        }
        return listAccount;
    } 
}
