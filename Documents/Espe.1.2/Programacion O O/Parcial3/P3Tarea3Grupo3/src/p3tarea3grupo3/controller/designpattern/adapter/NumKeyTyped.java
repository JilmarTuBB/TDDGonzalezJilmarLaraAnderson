
package p3tarea3grupo3.controller.designpattern.adapter;

import java.awt.event.KeyEvent;

// Interfaz para manejar eventos de teclado relacionados con la entrada de numeros y texto con numeros
public interface NumKeyTyped {
    
    // Metodo para manejar eventos de teclas que representan numeros
    public void numberKeyPress(KeyEvent evt);
    
    // Metodo para manejar eventos de teclas que representan texto y numeros
    public void textAndNumber(KeyEvent evt);
    
}
