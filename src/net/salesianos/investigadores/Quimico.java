package net.salesianos.investigadores;

import java.util.ArrayList;
import net.salesianos.trabajodual.TrabajoDual;

public class Quimico extends Investigador implements TrabajoDual {

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

    @Override
    public void trabajar() {
        invertirLista();
        System.out.println("El quimico mezcla los elementos invirtiendo sus posiciones.");
        mostrarElementos();
    }

    public void invertirLista() {
        for (int i = 0; i < elementosReaccion.size() / 2; i++) {
            String temporal = elementosReaccion.get(i);
            int ultimaPosicion = elementosReaccion.size() - 1 - i;
            elementosReaccion.set(i, elementosReaccion.get(ultimaPosicion));
            elementosReaccion.set(ultimaPosicion, temporal);
        }
    }

    public void mostrarElementos() {
        if (elementosReaccion.size() == 0) {
            System.out.println("La lista de elementos esta vacia.");
        } else {
            System.out.println("--- Elementos de la reaccion ---");

            for (int i = 0; i < elementosReaccion.size(); i++) {
                System.out.println((i + 1) + ". " + elementosReaccion.get(i));
            }
        }
    }
}
