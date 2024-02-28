
package p3tarea3grupo3.controller.designpattern.decorater;

import java.util.List;
import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.controller.ListClient;

public class DecoratorAuthenticate implements Authenticate{
    
    private Authenticate getAuthenticate;
    ListClient client;
    List<Account> listAccount;

    public DecoratorAuthenticate(Authenticate getAuthenticate) {
        this.getAuthenticate = getAuthenticate;
        client = ListClient.getInstance();
        listAccount = client.getAccount();
    }
    
    @Override
    public boolean getAuthenticate(String user, String pin){
        for (Account a : listAccount) {
            if(a.getPin().equals(pin)) {
                return true;
            }
        }
        return false;
    }
    
}
