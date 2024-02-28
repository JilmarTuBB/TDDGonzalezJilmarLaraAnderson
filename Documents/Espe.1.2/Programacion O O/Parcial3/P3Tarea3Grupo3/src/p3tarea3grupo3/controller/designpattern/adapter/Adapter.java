
package p3tarea3grupo3.controller.designpattern.adapter;

import java.awt.event.KeyEvent;

public class Adapter implements TextKeyTyped { //Clase que va adaptar diferentes eventos de teclado, letras y numeros
    //Adapter es un patrón de diseño estructural que permite la colaboración entre objetos con interfaces incompatibles.

    NumKeyTyped eventNum;

    public Adapter(NumKeyTyped eventNum) {
        this.eventNum = eventNum;
    }   
    
    @Override
    public void textKeyPress(KeyEvent evt) {
        eventNum.numberKeyPress(evt);
    }

    @Override
    public void textSpaceKeyPress(KeyEvent evt) {
        eventNum.textAndNumber(evt);
    }   
    
}
