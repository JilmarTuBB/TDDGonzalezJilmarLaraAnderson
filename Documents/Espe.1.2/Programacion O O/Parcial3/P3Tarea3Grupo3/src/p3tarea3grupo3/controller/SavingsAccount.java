
package p3tarea3grupo3.controller;

import org.bson.Document;

public class SavingsAccount extends Account{ //extiende o hereda la clase Account
    //Atributos
    Client client;
    double interest;
    //Constructor
    public SavingsAccount() {
        client = new Client();
    }
    //Datos de la cuenta bancaria   
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
