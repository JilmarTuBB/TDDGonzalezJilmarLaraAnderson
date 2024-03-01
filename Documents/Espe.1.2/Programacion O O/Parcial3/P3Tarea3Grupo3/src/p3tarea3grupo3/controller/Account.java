
package p3tarea3grupo3.controller;

import org.bson.Document; //Libreria

//Implementa la Interface CreateAccount 
public class Account implements CreateAccount { //Clase cuenta del Sistema Bancario
    
    //Atributos privados 
    
    //Encapsula la información relacionada con una cuenta bancaria
    private int id;
    private String accountNumber;
    private String titular;
    private String user;
    private String password;
    private String pin;
    private double balance;
    private Client client; //Objeto de tipo Client que representa el cliente asociado a la cuenta
    
    //Constructor con parametros inicializados
    public Account(int id, String accountNumber, String titular, String user, String password, String pin, double balance, Client client) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.titular = titular;
        this.user = user;
        this.password = password;
        this.pin = pin;
        this.balance = balance;
        this.client = client;
    }
    //Constructor vacio utilizado para instanciar objetos sin establecer valores iniciales
    public Account() {
    }
    
    //Metodos

    @Override //Sobreescritura de metodos
    
    /*
    Este metodo recibe un objeto de tipo Account y devuelve un documento de MongoDB (org.bson.Document)
    Este documento contiene todos los atributos de la cuenta, asi como el documento de cliente obtenido mediante el método getDocument() de la clase Client.
    */
    public Document getDocument(Account account) {
        Client cli = new Client();
        Document document = new Document();
            document.put("id", account.getId());
            document.put("accountNumber", account.getAccountNumber());
            document.put("titular", account.getTitular());
            document.put("user", account.getUser());
            document.put("password", account.getPassword());
            document.put("pin", account.getPin());
            document.put("balance", account.getBalance());
            document.put("client", cli.getDocument(account.getClient()));
            
        return document;
    }

    @Override //Sobreescritura de metodos
    
    /*
    Este método recibe un documento de MongoDB y devuelve un objeto de tipo Account. Extrae los valores de los campos del documento y crea un nuevo objeto Account. 
    Ademas, crea un objeto Client utilizando el método getObject() de la clase Client para obtener el cliente asociado a la cuenta.
    */
     public Account getObject(Document doc) {
        Client client = new Client();
        int id = doc.getInteger("id");
        String accountNumber = doc.getString("accountNumber");
        String titular = doc.getString("titular");
        String user = doc.getString("user");
        String password = doc.getString("password");
        String pin = doc.getString("pin");
        double balance = doc.getDouble("balance");
        Client c = client.getObject((Document) doc.get("client"));

        return new Account(id, accountNumber, titular, user, password, pin, balance, c) {};
    }
    //Metodos Getters and Setters de la clase Account 

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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
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
