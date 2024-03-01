
package p3tarea3grupo3.controller.designpattern.factorymethod;

import p3tarea3grupo3.controller.Account;

// Clase abstracta que actua como la fabrica abstracta para las transacciones en general
public abstract class TransactionFactory {
    
    // Metodo abstracto para crear transacciones
    public abstract Transaction createTransaction();
    
    // Metodo para aplicar la transaccion a una cuenta
    public void applicationTransaction(Account account) {
        // Crear una nueva instancia de transaccion usando el metodo factory
        Transaction transaction = createTransaction();
        // Aplicar la transaccion a la cuenta
        transaction.applicationn(account);
    }
}

