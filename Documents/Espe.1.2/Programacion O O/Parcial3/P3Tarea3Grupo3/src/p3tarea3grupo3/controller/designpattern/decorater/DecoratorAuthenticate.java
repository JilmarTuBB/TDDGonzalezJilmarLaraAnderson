
package p3tarea3grupo3.controller.designpattern.decorater;

import java.util.List;
import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.controller.ListClient;

//Clase que implementa la interface Autheticate
public class DecoratorAuthenticate implements Authenticate{
    
    private Authenticate getAuthenticate;
    ListClient client;
    List<Account> listAccount;

    // Constructor que recibe una instancia de Authenticate
    public DecoratorAuthenticate(Authenticate getAuthenticate) {
        this.getAuthenticate = getAuthenticate;
        client = ListClient.getInstance(); // Obtener la instancia de ListClient (patron Singleton)
        listAccount = client.getAccount(); // Obtener la lista de cuentas de clientes
    }
    
    // Metodo para autenticar un usuario con un PIN
    @Override
    public boolean getAuthenticate(String user, String pin){
        // Iterar sobre la lista de cuentas de clientes
        for (Account a : listAccount) {
            // Si el PIN coincide con el de alguna cuenta, retorna verdadero
            if(a.getPin().equals(pin)) {
                return true;
            }
        }
        // Si no se encuentra coincidencia, retorna falso
        return false;
    }    
}

