package net.salesianos.investigadores;

public class Matematico extends Investigador {

    protected int[][] resultadosActuales;

    public Matematico(String nombre, String especialidad, double sueldo, int[][] resultadosActuales) {
        super(nombre, especialidad, sueldo);
        this.resultadosActuales = resultadosActuales;
    }

    public int[][] getResultadosActuales() {
        return resultadosActuales;
    }

}
