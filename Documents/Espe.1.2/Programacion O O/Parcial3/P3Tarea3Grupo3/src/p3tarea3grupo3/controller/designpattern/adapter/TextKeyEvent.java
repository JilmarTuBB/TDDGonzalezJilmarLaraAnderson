
package p3tarea3grupo3.controller.designpattern.adapter;

import java.awt.event.KeyEvent;

// Clase que implementa la interface TextKeyTyped
public class TextKeyEvent implements TextKeyTyped {

    // Constructor 
    public TextKeyEvent(String text) {
        
    }

    // Metodo para manejar eventos de teclas que representan texto sin espacios
    @Override
    public void textKeyPress(KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!Character.isLetter(txt) && txt != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        } 
    }

    // Metodo para manejar eventos de teclas que representan texto con espacios y otros caracteres
    @Override
    public void textSpaceKeyPress(KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!Character.isLetter(txt) && txt != KeyEvent.VK_BACK_SPACE && txt != KeyEvent.VK_SPACE && txt != KeyEvent.VK_PERIOD) {
            evt.consume();
        } 
    }    
}

