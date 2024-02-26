
package p3tarea3grupo3;

import org.bson.Document;
import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.controller.Client;
import p3tarea3grupo3.model.CreateMongo;
import p3tarea3grupo3.view.LoginWindows;

public class P3Tarea3Grupo3 {

    public static void main(String[] args) {
       LoginWindows w = new LoginWindows();
       w.setVisible(true);
      
       /*CreateMongo c = new CreateMongo("Account");
       Client cli = new Client("Jilmar Ivan","Gonzalez Lojan","1752597953","O+","01 march 2003","Soltero/a",987654321L,"Estudiante","jigonzalez3","Ecuatoriana","Pichincha","Quito","Bryan Minayo",987654123L);
       Account a = new Account(123456,"2206122194","Jilmar Gonzalez","jigonzalez3","010302",175259,100.0D,cli);
       
       Document doc = a.getDocument(a);
       
       c.addDocument(doc);*/
         
    }
    
}
