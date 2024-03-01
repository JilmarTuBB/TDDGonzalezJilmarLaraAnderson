
package p3tarea3grupo3.controller.designpattern.decorater;

import java.util.List;
import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.controller.ListClient;

public class AuthenticateUser implements Authenticate{
    
    ListClient client;
    List<Account> listAccount;
    
    // Constructor que inicializa la lista de cuentas de clientes
    public AuthenticateUser() {
        client = ListClient.getInstance(); // Obtener la instancia de ListClient (patron Singleton)
        listAccount = client.getAccount(); // Obtener la lista de cuentas de clientes
    }

    // Metodo para autenticar un usuario con un nombre de usuario y una contraseña
    @Override
    public boolean getAuthenticate(String user, String pass) {
        // Iterar sobre la lista de cuentas de clientes
        for (Account a : listAccount) {
            // Si el nombre de usuario y la contraseña coinciden con alguna cuenta, retorna verdadero
            if(a.getPassword().equals(pass) && a.getUser().equals(user)) {
                return true;
            }
        }
        // Si no se encuentra coincidencia, retorna falso
        return false;
    }
}

