
package p3tarea3grupo3.controller;

import org.bson.Document;

public class CurrentAccount extends Decorator{

    @Override
    public Document getDocument(Account account) {
        
        return new Document();
    }

    @Override
    public Object getObject(Document document) {
      return new Client();
    }


   
}
