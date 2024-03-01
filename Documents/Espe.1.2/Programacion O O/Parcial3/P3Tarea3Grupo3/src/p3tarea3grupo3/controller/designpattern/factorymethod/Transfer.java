
package p3tarea3grupo3.controller.designpattern.factorymethod;

import org.bson.Document;
import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.model.ReadMongo;
import p3tarea3grupo3.model.UpdateMongo;

// Clase concreta que implementa la interfaz Transaction para realizar una transacción de transferencia

public class Transfer implements Transaction{

    private ReadMongo readMongo;
    private UpdateMongo updateMongo;
    private Account getDocument;
    private String camp = "accountNumber";

    // Implementacion del metodo para realizar una transaccion de transferencia
    
    @Override //sobreescritura de metodo
    public void applicationn(Account account) {
        
        readMongo = new ReadMongo();
        updateMongo = new UpdateMongo();       
        getDocument = new Account();
        
        String numberAccount = account.getAccountNumber();
        Document doc = readMongo.readDocument(camp, numberAccount);
        
        double currentBalance = doc.getDouble("balance");
        double saldo = account.getBalance();
        
        double total = currentBalance + saldo;
        
        account.setBalance(total);
        System.out.println("Total en trnaferencias " + total);
        Document document = getDocument.getDocument(account);   
    
        updateMongo.updateDocument(doc, document);
        
    }
    
}
