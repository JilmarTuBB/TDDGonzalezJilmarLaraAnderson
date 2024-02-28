
package p3tarea3grupo3.controller.designpattern.adapter;

import java.awt.event.KeyEvent;

public class TextKeyEvent implements TextKeyTyped{

    public TextKeyEvent(String text) {
    }

    @Override
    public void textKeyPress(KeyEvent evt) {
        char txt = evt.getKeyChar();
        if(!Character.isLetter(txt) && txt != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        } 
    }

    @Override
    public void textSpaceKeyPress(KeyEvent evt) {
        char txt = evt.getKeyChar();
        if(!Character.isLetter(txt) && txt != KeyEvent.VK_BACK_SPACE && txt != KeyEvent.VK_SPACE && txt != KeyEvent.VK_PERIOD) {
            evt.consume();
        } 
    }
    
}
