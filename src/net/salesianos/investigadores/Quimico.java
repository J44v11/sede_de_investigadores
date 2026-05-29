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

    public void setElementosReaccion(ArrayList<String> elementosReaccion) {
        this.elementosReaccion = elementosReaccion;
    }

    public void anadirElemento(String elemento) {
        if (elemento.trim().isEmpty()) {
            System.out.println("No se puede anadir un elemento vacio.");
        } else {
            elementosReaccion.add(elemento);
            System.out.println("Elemento anadido: " + elemento);
        }
    }

    @Override
    public String estadoSueldo() {
        if (sueldo < 1200) {
            return "El quimico necesita solicitar un aumento.";
        } else {
            return "El sueldo del quimico es correcto.";
        }
    }
}
