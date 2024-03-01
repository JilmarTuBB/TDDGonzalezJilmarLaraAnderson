
package p3tarea3grupo3.controller;

import org.bson.Document;

public class Client { //Clase Clietn representa un cliente del sistema Bancario

    //Atributos 
    private String name;
    private String lastName;
    private String identification;
    private String code;
    private String birthDate;
    private String status;
    private long phone;
    private String address;
    private String occupation;
    private String email;
    private String nationality;
    private String province;
    private String city;   
    private String referenceName;
    private long referencePhone;

    //Constructores
    public Client() {
    }
    //Constructor que acepta todos los atributos del cliente como parametros y los inicializa

    public Client(String name, String lastName, String identification, String code, String birthDate, String status, long phone, 
        String address, String occupation, String email, String nationality, String province, String city, String referenceName, long referencePhone) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.code = code;
        this.birthDate = birthDate;
        this.status = status;
        this.phone = phone;
        this.address = address;
        this.occupation = occupation;
        this.email = email;
        this.nationality = nationality;
        this.province = province;
        this.city = city;
        this.referenceName = referenceName;
        this.referencePhone = referencePhone;
    }

//Metodos Getters and Setters
    public long getReferencePhone() {
        return referencePhone;
    }

    public void setReferencePhone(long referencePhone) {
        this.referencePhone = referencePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }
    
    /*
    Este metodo toma un objeto de tipo Client como parametro y devuelve un documento de MongoDBque representa al cliente. 
    Este metodo es utilizado para convertir objetos de tipo Client en documentos MongoDB que pueden ser almacenados en una base de datos MongoDB.
    */
    
    public Document getDocument(Client client){
        Document doc = new Document();
            doc.put("name", client.getName());
            doc.put("lastName", client.getLastName());
            doc.put("identification", client.getIdentification());
            doc.put("code", client.getCode());
            doc.put("birthDate", client.getBirthDate());
            doc.put("status", client.getStatus());
            doc.put("phone", client.getPhone());
            doc.put("address", client.getAddress());
            doc.put("occupation", client.getOccupation());
            doc.put("email", client.getEmail());
            doc.put("nationality", client.getNationality());
            doc.put("province", client.getProvince());
            doc.put("city", client.getCity());
            doc.put("referenceName", client.getReferenceName());
            doc.put("referencePhone", client.getReferencePhone());
            
        return doc;
    }
    /*
    Este metodo toma un documento de MongoDB como parametro y devuelve un objeto de tipo Client. 
    Extrae los valores de los campos del documento y crea un nuevo objeto Client con estos valores. 
    Este metodo es utilizado para convertir documentos MongoDB en objetos de tipo Client
    */
    public Client getObject(Document doc) {
            String name = doc.getString("name");
            String lastName = doc.getString("lastName");
            String identification = doc.getString("identification");
            String code = doc.getString("code");
            String birthDate = doc.getString("birthDate");
            String status = doc.getString("status");
            long phone = doc.getLong("phone");
            String address = doc.getString("address");
            String occupation = doc.getString("occupation");
            String email = doc.getString("email");
            String nationality = doc.getString("nationality");
            String province = doc.getString("province");
            String city = doc.getString("city");
            String referenceName = doc.getString("referenceName");
            long referencePhone = doc.getLong("referencePhone");

        return new Client(name, lastName, identification, code, birthDate, status, phone, 
                          address, occupation, email, nationality, province, city, referenceName, referencePhone);
    }

  
}
