
package p3tarea3grupo3.view;

import java.awt.event.KeyEvent;

public class KeyboardEvents implements NumericKeyListener,LetterKeyListener {

    @Override
    public void numberKeyPress(KeyEvent evt) {
     char num = evt.getKeyChar();
        if(!Character.isDigit(num) && num != KeyEvent.VK_BACK_SPACE && num != KeyEvent.VK_PERIOD ) {
            evt.consume();
        }
    }

    @Override
    public void dateNum(String number, KeyEvent evt) {
        
        char date = evt.getKeyChar();
        if(!Character.isDigit(date) && date != KeyEvent.VK_SPACE || number.length() > 9){
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

    @Override
    public void textKeyPress(KeyEvent evt) {       
        char txt = evt.getKeyChar();
        if(!Character.isLetter(txt) && txt != KeyEvent.VK_BACK_SPACE) {
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
