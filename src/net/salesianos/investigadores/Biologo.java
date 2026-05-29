package net.salesianos.investigadores;

import java.util.ArrayList;
import net.salesianos.trabajodual.TrabajoDual;

public class Biologo extends Investigador implements TrabajoDual {

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

    @Override
    public void trabajar() {
        if (especimenesInvestigacion.size() == 0) {
            System.out.println("No hay especimenes para investigar.");
        } else {
            ordenarPorLongitud();
            String especimenEliminado = especimenesInvestigacion.remove(especimenesInvestigacion.size() - 1);
            System.out.println("Lista ordenada por longitud y se ha eliminado el mayor: " + especimenEliminado);
            mostrarEspecimenes();
        }
    }

     @Override
    public void trabajoDual() {
        invertirLista();
        System.out.println("Trabajo dual del biologo: invierte la lista como un quimico.");
        mostrarEspecimenes();
    }

    public void ordenarPorLongitud() {
        for (int i = 0; i < especimenesInvestigacion.size() - 1; i++) {
            for (int j = 0; j < especimenesInvestigacion.size() - 1 - i; j++) {
                if (especimenesInvestigacion.get(j).length() > especimenesInvestigacion.get(j + 1).length()) {
                    String temporal = especimenesInvestigacion.get(j);
                    especimenesInvestigacion.set(j, especimenesInvestigacion.get(j + 1));
                    especimenesInvestigacion.set(j + 1, temporal);
                }
            }
        }
    }

    public void invertirLista() {
        for (int i = 0; i < especimenesInvestigacion.size() / 2; i++) {
            String temporal = especimenesInvestigacion.get(i);
            int ultimaPosicion = especimenesInvestigacion.size() - 1 - i;
            especimenesInvestigacion.set(i, especimenesInvestigacion.get(ultimaPosicion));
            especimenesInvestigacion.set(ultimaPosicion, temporal);
        }
    }

    public void mostrarEspecimenes() {
        if (especimenesInvestigacion.size() == 0) {
            System.out.println("La lista de especimenes esta vacia.");
        } else {
            System.out.println("--- Especimenes en investigacion ---");

            for (int i = 0; i < especimenesInvestigacion.size(); i++) {
                System.out.println((i + 1) + ". " + especimenesInvestigacion.get(i));
            }
        }
    }
}
