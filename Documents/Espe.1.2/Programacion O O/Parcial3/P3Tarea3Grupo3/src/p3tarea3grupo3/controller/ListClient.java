
package p3tarea3grupo3.controller;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import p3tarea3grupo3.model.ReadMongo;


public class ListClient {

    public static ListClient client;

    ReadMongo readMongo;
    Account account;
    List<Account> listAccount;

    private ListClient() {
        readMongo = new ReadMongo();
        account = new Account();
    }
    
    public static ListClient getInstance(){
        if(client == null){
            client = new ListClient();
        }
        return client;
    }
    
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
