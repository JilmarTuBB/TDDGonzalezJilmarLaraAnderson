
package p3tarea3grupo3.controller.designpattern.factorymethod;

import org.bson.Document;
import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.model.ReadMongo;
import p3tarea3grupo3.model.UpdateMongo;

//Clase concreta que implementa la interface Transaction para realizar una transacción de deposito

public class Deposit implements Transaction {
    //Atributos
    private ReadMongo readMongo;
    private UpdateMongo updateMongo;
    private Account getDocument;
    private String camp = "accountNumber";
    
// Implementación del metodo para realizar una transacción de deposito

    @Override
    public void applicationn(Account account) {    
        readMongo = new ReadMongo();
        updateMongo = new UpdateMongo();       
        getDocument = new Account();
        //Deposito
        String numberAccount = account.getAccountNumber();
        Document doc = readMongo.readDocument(camp, numberAccount);
        
        double currentBalance = doc.getDouble("balance");
        double saldo = account.getBalance();
        
        double total = currentBalance + saldo;
        
        account.setBalance(total);
        
        Document document = getDocument.getDocument(account);   
    
        updateMongo.updateDocument(doc, document);
    }
    
}
