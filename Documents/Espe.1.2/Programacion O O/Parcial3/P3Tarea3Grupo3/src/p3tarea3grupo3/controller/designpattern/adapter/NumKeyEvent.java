
package p3tarea3grupo3.controller.designpattern.adapter;

import java.awt.event.KeyEvent;

// Implementa la interface NumKeyTyped
public class NumKeyEvent implements NumKeyTyped {

    // Metodo para manejar eventos de teclas que representan numeros
    @Override
    public void numberKeyPress(KeyEvent evt) {
        // Obtiene el caracter de la tecla presionada
        char num = evt.getKeyChar();
        // Verifica si el carccter no es un digito, ni la tecla de retroceso, ni el punto decimal
        if (!Character.isDigit(num) && num != KeyEvent.VK_BACK_SPACE && num != KeyEvent.VK_PERIOD) {
            // Consume el evento para evitar que se procese
            evt.consume();
        }
    }

    // Metodo para manejar eventos de teclas que representan texto y numeros
    @Override
    public void textAndNumber(KeyEvent evt) {
        // Obtiene el caracter de la tecla presionada
        char date = evt.getKeyChar();
        // Verifica si el caracter no es una letra, un digito, ni las teclas de espacio, retroceso o punto decimal
        if (!Character.isLetterOrDigit(date) && date != KeyEvent.VK_SPACE && date != KeyEvent.VK_BACK_SPACE && date != KeyEvent.VK_PERIOD) {
            // Consume el evento para evitar que se procese
            evt.consume();
        }
    }
}
