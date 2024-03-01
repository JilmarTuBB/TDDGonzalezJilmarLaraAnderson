
package p3tarea3grupo3.controller.designpattern.factorymethod;

import p3tarea3grupo3.controller.Account;

// Interface que define el comportamiento comun para todas las transacciones
public interface Transaction {
    
    // Metodo para aplicar la transaccion a una cuenta
    public void applicationn(Account account);
}
