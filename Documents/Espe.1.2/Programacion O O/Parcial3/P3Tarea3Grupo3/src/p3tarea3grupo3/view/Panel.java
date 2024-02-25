
package p3tarea3grupo3.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Panel {
    
    public void showPanel(JPanel PnlPrueba, JPanel p) {
    
        p.setSize(660, 670);
        p.setLocation(0, 0);       
        PnlPrueba.removeAll();
        PnlPrueba.add(p,BorderLayout.CENTER);
        PnlPrueba.revalidate();
        PnlPrueba.repaint();
        
    }
    
}
