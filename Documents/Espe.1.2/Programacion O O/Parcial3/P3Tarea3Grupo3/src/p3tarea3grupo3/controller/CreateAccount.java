
package p3tarea3grupo3.controller;

import org.bson.Document;

public interface CreateAccount<T> {
    
    
    public Document getDocument(Account account);

    public T getObject(Document document);
}
