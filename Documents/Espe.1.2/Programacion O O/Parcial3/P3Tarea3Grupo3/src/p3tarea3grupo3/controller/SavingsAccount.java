
package p3tarea3grupo3.controller;

import org.bson.Document;

public class SavingsAccount extends Account{

    Client client;
    double interest;

    public SavingsAccount() {
        client = new Client();
    }
    
    
    @Override
    public Document getDocument(Account account) {
        Document document = new Document();
            document.put("id", account.getId());
            document.put("accountNumber", account.getAccountNumber());
            document.put("titular", account.getTitular());
            document.put("user", account.getUser());
            document.put("password", account.getPassword());
            document.put("balance", account.getBalance());
            document.put("client", client.getDocument(account.getClient()));
            
        return document;
    }
    
    
}
