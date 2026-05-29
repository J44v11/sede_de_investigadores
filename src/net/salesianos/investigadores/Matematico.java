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

    public void setResultadosActuales(int[][] resultadosActuales) {
        this.resultadosActuales = resultadosActuales;
    }

    @Override
    public String estadoSueldo() {
        if (sueldo < 1800) {
            return "El matematico necesita un aumento";
        } else {
            return "El sueldo del matematico esta bien";
        }
    }

    @Override
    public void trabajar() {
        System.out.println("El matematico trabaja siempre con matrices 3x3.");
    }
}
