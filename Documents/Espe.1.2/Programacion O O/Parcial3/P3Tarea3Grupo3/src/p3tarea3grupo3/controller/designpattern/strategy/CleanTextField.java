
package p3tarea3grupo3.controller.designpattern.strategy;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class CleanTextField implements CleanComponent{
    // Metodo para limpiar los campos de texto de un panel

    @Override
    public void cleanField(JPanel panel) {
        for (int i = 0; panel.getComponentCount() > i; i++) {
            if(panel.getComponents()[i] instanceof JTextField) {
                JTextField field = (JTextField) panel.getComponents()[i];
                field.setText("");
            }
        }
    }
    
}
