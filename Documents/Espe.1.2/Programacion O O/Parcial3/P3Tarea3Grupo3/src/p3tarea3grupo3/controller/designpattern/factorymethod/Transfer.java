
package p3tarea3grupo3.controller.designpattern.factorymethod;

import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.controller.designpattern.factorymethod.Transaction;

public class Transfer implements Transaction{

    @Override
    public void applicationn(Account account) {
        
        System.out.println("Hiciste una transferencia");
        
    }
    
}
