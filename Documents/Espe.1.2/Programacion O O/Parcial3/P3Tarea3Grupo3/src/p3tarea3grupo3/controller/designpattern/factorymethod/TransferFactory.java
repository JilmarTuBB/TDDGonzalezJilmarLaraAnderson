
package p3tarea3grupo3.controller.designpattern.factorymethod;

import p3tarea3grupo3.controller.designpattern.factorymethod.Transfer;
import p3tarea3grupo3.controller.designpattern.factorymethod.TransactionFactory;
import p3tarea3grupo3.controller.designpattern.factorymethod.Transaction;

public class TransferFactory extends TransactionFactory{

    @Override
    public Transaction createTransaction() {
        return new Transfer();
    }
        
        
    
}
