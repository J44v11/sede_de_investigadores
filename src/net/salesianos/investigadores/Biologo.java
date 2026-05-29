package net.salesianos.investigadores;

import java.util.ArrayList;

public class Biologo extends Investigador {

     protected ArrayList<String> especimenesInvestigacion;

    public Biologo(String nombre, String especialidad, double sueldo) {
        super(nombre, especialidad, sueldo);
        this.especimenesInvestigacion = new ArrayList<>();
    }
    
}
