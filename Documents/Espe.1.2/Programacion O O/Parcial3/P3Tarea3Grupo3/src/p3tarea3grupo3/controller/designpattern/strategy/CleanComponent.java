
package p3tarea3grupo3.controller.designpattern.strategy;

import javax.swing.JPanel;

// Interface que define el comportamiento comun para todas las estrategias de limpieza
public interface CleanComponent {
    
    // Metodo para limpiar los componentes de un panel
    public void cleanField(JPanel panel);
}

