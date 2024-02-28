
package p3tarea3grupo3.controller.designpattern.decorater;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.List;
import org.bson.Document;
import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.controller.ListClient;
import p3tarea3grupo3.controller.designpattern.singleton.ConnectionMongo;

public class AuthenticateUser implements Authenticate{
    
    ListClient client;
    List<Account> listAccount;
    
    public AuthenticateUser() {
        client = ListClient.getInstance();
        listAccount = client.getAccount();
    }

    @Override
    public boolean getAuthenticate(String user, String pass) {
        for (Account a : listAccount) {
            if(a.getPassword().equals(pass) && a.getUser().equals(user)) {
                return true;
            }
        }
        return false;
    }

    
    
}
