
package p3tarea3grupo3;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.List;
import javax.swing.SwingUtilities;
import org.bson.Document;
import p3tarea3grupo3.controller.Account;
import p3tarea3grupo3.controller.Client;
import p3tarea3grupo3.controller.ListClient;
import p3tarea3grupo3.controller.designpattern.factorymethod.Deposit;
import p3tarea3grupo3.controller.designpattern.factorymethod.Transaction;
import p3tarea3grupo3.controller.designpattern.factorymethod.TransactionFactory;
import p3tarea3grupo3.controller.designpattern.factorymethod.TransferFactory;
import p3tarea3grupo3.controller.designpattern.factorymethod.WithdrawlFactory;
import p3tarea3grupo3.model.CreateMongo;
import p3tarea3grupo3.model.Json;
import p3tarea3grupo3.view.LoginWindows;

public class P3Tarea3Grupo3 {

    public static void main(String[] args) {
      
        FlatLightLaf.setup();
        SwingUtilities.invokeLater(()->{
            new LoginWindows();
        });
       
      
       /*CreateMongo c = new CreateMongo();
       Client cli = new Client("Jilmar Ivan","Gonzalez Lojan","1752597953","O+","01 march 2003","Soltero/a",987654321L,"Luz de America","Estudiante","jigonzalez3","Ecuatoriana","Pichincha","Quito","Bryan Minayo",987654123L);
       Account a = new Account(123456,"2206122194","Jilmar Gonzalez","jigonzalez3","010302","123456",100.0D,cli);
       
       Document doc = a.getDocument(a);
       
       c.addDocument(doc);
       
       Transaction t = new Deposit();
       
       t.applicationn(a);
       
       /*TransactionFactory factory;
       
       factory = new WithdrawlFactory();
       factory.applicationTransaction();
       
       factory  = new TransferFactory();
       factory.applicationTransaction();*/
       
         
    }
    
}
