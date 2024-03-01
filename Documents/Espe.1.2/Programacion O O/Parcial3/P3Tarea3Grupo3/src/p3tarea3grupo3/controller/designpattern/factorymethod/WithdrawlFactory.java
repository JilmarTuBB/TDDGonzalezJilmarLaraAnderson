
package p3tarea3grupo3.controller.designpattern.factorymethod;

// Subclase concreta de la fabrica de transacciones para crear transacciones de retiro

public class WithdrawlFactory extends TransactionFactory{

// Implementacion del metodo para crear una transaccion de retiro

    @Override
    public Transaction createTransaction() {
        return new Withdrawal();
    }
    
}
