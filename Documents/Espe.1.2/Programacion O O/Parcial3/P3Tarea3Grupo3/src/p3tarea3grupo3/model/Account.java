
package p3tarea3grupo3.model;


public class Account {
    
    private String accoutnNumber;
    private String titular;
    private double balance;
    private Client client;

    public Account() {
    }

    public Account(String accoutnNumber, String titular, double balance, Client client) {
        this.accoutnNumber = accoutnNumber;
        this.titular = titular;
        this.balance = balance;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAccoutnNumber() {
        return accoutnNumber;
    }

    public void setAccoutnNumber(String accoutnNumber) {
        this.accoutnNumber = accoutnNumber;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
    
}
