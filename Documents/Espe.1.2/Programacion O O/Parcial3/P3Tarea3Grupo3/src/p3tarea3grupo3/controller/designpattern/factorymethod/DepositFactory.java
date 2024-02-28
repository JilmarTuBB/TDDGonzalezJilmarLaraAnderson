
package p3tarea3grupo3.controller.designpattern.factorymethod;

import p3tarea3grupo3.controller.Account;


public abstract class DepositFactory {
    
    public abstract Transaction createTransaction();
    
    public void applicationTransaction(Account account) {
        
        Transaction transaction = createTransaction();
    
        transaction.applicationn(account);
        
    }
    
}
