
package p3tarea3grupo3.controller.designpattern.factorymethod;

import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.controller.designpattern.factorymethod.Transaction;

public abstract class TransactionFactory {
    
    public abstract Transaction createTransaction();
    
    public void applicationTransaction(Account account) {
        
        Transaction transaction = createTransaction();
    
        transaction.applicationn(account);
        
    }
    
}
