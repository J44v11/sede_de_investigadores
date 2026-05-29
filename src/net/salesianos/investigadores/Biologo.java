package net.salesianos.investigadores;

import java.util.ArrayList;

public class Biologo extends Investigador {

    protected ArrayList<String> especimenesInvestigacion;

    public Biologo(String nombre, String especialidad, double sueldo) {
        super(nombre, especialidad, sueldo);
        this.especimenesInvestigacion = new ArrayList<>();
    }

    public ArrayList<String> getEspecimenesInvestigacion() {
        return especimenesInvestigacion;
    }

    public void setEspecimenesInvestigacion(ArrayList<String> especimenesInvestigacion) {
        this.especimenesInvestigacion = especimenesInvestigacion;
    }

    public void anadirEspecimen(String especimen) {
        if (especimen.trim().isEmpty()) {
            System.out.println("No se puede anadir un especimen vacio.");
        } else {
            especimenesInvestigacion.add(especimen);
            System.out.println("Especimen anadido: " + especimen);
        }
    }

    @Override
    public String estadoSueldo() {
        if (sueldo < 1500) {
            return "El biologo necesita un aumento.";
        } else {
            return "El sueldo del biologo esta bien.";
        }
    }
}
