
package p3tarea3grupo3.controller.designpattern.strategy;

import javax.swing.JPanel;

/*
Strategy permite definir una familia de algoritmos, colocar cada 
uno de ellos en una clase separada y hacer sus objetos intercambiables.
*/
public class Clean {
    
    private CleanComponent cleanComponet;

    public Clean(CleanComponent cleanComponet) {
        this.cleanComponet = cleanComponet;
    }

    public void setClean(CleanComponent cleanComponet) {
        this.cleanComponet = cleanComponet;
    }
    
    public void getClean(JPanel panel) {
        cleanComponet.cleanField(panel);
    }
    
}
