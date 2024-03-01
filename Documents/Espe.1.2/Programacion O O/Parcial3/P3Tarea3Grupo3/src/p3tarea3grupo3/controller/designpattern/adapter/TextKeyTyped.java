
package p3tarea3grupo3.controller.designpattern.adapter;

import java.awt.event.KeyEvent;

// Interfaz para manejar eventos de teclado relacionados con la entrada de texto
public interface TextKeyTyped {
    
    // Metodo para manejar eventos de teclas que representan texto sin espacios
    public void textKeyPress(KeyEvent evt);
    
    // Metodo para manejar eventos de teclas que representan texto con espacios
    public void textSpaceKeyPress(KeyEvent evt);
    
}
