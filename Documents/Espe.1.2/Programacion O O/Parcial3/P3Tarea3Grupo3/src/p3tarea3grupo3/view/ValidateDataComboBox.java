
package p3tarea3grupo3.view;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ValidateDataComboBox implements ValidateField{

    @Override
    public boolean validateField(JPanel panel) {
        for (int i = 0; panel.getComponentCount() > i; i++) {
            if(panel.getComponents()[i] instanceof JComboBox comboBox) {
                if(comboBox.getSelectedItem().equals("-")){
                    return false;
                }
            }
        }
        return true;
    }
    
}
