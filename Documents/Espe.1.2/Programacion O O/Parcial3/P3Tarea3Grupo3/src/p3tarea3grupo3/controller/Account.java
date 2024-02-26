
package p3tarea3grupo3.controller;

import org.bson.Document;

public abstract class Account implements CreateAccount {
    
    private int id;
    private String accountNumber;
    private String titular;
    private String user;
    private String password;
    private int pin;
    private double balance;
    private Client client;

    public Account(int id, String accountNumber, String titular, String user, String password, int pin, double balance, Client client) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.titular = titular;
        this.user = user;
        this.password = password;
        this.pin = pin;
        this.balance = balance;
        this.client = client;
    }

    public Account() {
    }

    @Override
    public Document getDocument(Account account) {
        Document document = new Document();
            document.put("id", account.getId());
            document.put("accountNumber", account.getAccountNumber());
            document.put("titular", account.getTitular());
            document.put("user", account.getUser());
            document.put("password", account.getPassword());
            document.put("balance", account.getBalance());
            document.put("client", client.getDocument(account.getClient()));
            
        return document;
    }

    @Override
     public Account getObject(Document doc) {
        int id = doc.getInteger("id");
        String accountNumber = doc.getString("accountNumber");
        String titular = doc.getString("titular");
        String user = doc.getString("user");
        String password = doc.getString("password");
        int pin = doc.getInteger("pin");
        double balance = doc.getDouble("balance");
        Client c = client.getObject((Document) doc.get("client"));

        return new Account(id, accountNumber, titular, user, password, pin, balance, c) {};
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

     
}