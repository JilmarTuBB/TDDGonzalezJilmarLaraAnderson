
package p3tarea3grupo3.controller;

import org.bson.Document;

/*
Esta interface define dos métodos que son utilizados 
para convertir objetos de tipo Account en documentos MongoDB y viceversa.
*/
public interface CreateAccount<T> {
    
    /*
     Conversion entre objetos de tipo Account y documentos MongoDB
    */
    public Document getDocument(Account account);

    public T getObject(Document document);
    
}
