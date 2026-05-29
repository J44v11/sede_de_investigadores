package net.salesianos.investigadores;

import java.util.ArrayList;

public class Quimico extends Investigador {

    protected ArrayList<String> elementosReaccion;

    public Quimico(String nombre, String especialidad, double sueldo) {
        super(nombre, especialidad, sueldo);
        this.elementosReaccion = new ArrayList<>();
    }
    
    public ArrayList<String> getElementosReaccion() {
        return elementosReaccion;
    }
}
