
package p3tarea3grupo3.controller.designpattern.adapter;

import java.awt.event.KeyEvent;

public class NumKeyEvent implements NumKeyTyped{

    @Override
    public void numberKeyPress(KeyEvent evt) {
        char num = evt.getKeyChar();
        if(!Character.isDigit(num) && num != KeyEvent.VK_BACK_SPACE && num != KeyEvent.VK_PERIOD ) {
            evt.consume();
        }
    }
        

    @Override
    public void textAndNumber(KeyEvent evt) {
        char date = evt.getKeyChar();
        if(!Character.isLetterOrDigit(date) && date != KeyEvent.VK_SPACE && date != KeyEvent.VK_BACK_SPACE && date != KeyEvent.VK_PERIOD) {
            evt.consume();
        }
    }
    
}
