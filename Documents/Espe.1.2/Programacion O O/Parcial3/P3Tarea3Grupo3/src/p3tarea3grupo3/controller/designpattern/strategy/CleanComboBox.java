
package p3tarea3grupo3.controller.designpattern.strategy;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CleanComboBox implements CleanComponent{

    @Override
    public void cleanField(JPanel panel) {
        for (int i = 0; panel.getComponentCount() > i; i++) {
            if(panel.getComponents()[i] instanceof JComboBox) {
                JComboBox combo = (JComboBox) panel.getComponents()[i];
                combo.setSelectedIndex(0);
            }
        }
    }
           
}
