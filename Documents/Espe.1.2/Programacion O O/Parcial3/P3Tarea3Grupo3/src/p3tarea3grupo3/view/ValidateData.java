
package p3tarea3grupo3.view;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ValidateData implements ValidateField{
    
    @Override
    public boolean validateField(JPanel panel) {
        for (int i = 0; panel.getComponentCount() > i; i++) {
            if (panel.getComponents()[i] instanceof JTextField jTextField) {
                if (jTextField.getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
