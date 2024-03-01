
package p3tarea3grupo3.controller.designpattern.factorymethod;

import org.bson.Document;
import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.model.ReadMongo;
import p3tarea3grupo3.model.UpdateMongo;

// Clase concreta que implementa la interface Transaction para realizar una transaccion de retiro

public class Withdrawal implements Transaction {

    private ReadMongo readMongo;
    private UpdateMongo updateMongo;
    private Account getDocument;
    private String camp = "accountNumber";

    //Implementacion del metodo para realizar una transaccion de retiro

    @Override
    public void applicationn(Account account) {
        readMongo = new ReadMongo();
        updateMongo = new UpdateMongo();       
        getDocument = new Account();
        
        String numberAccount = account.getAccountNumber();
        Document doc = readMongo.readDocument(camp, numberAccount);
        
        double currentBalance = doc.getDouble("balance");
        System.out.println(currentBalance);
        double saldo = account.getBalance();
        System.out.println("Saldo aya " + saldo);
        double total = currentBalance - saldo;
        System.out.println(total);
        
        account.setBalance(total);
        
        Document document = getDocument.getDocument(account);   
    
        updateMongo.updateDocument(doc, document);
        
    }
    
}
