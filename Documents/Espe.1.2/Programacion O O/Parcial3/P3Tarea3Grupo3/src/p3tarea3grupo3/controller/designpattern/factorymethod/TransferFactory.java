
package p3tarea3grupo3.controller.designpattern.factorymethod;


// Subclase concreta de la fabrica de transacciones para crear transacciones de transferencia
public class TransferFactory extends TransactionFactory {
    
    // Implementacion del metodo para crear una transaccion de transferencia
    @Override
    public Transaction createTransaction() {
        return new Transfer();
    }
}

