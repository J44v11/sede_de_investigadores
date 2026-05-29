package net.salesianos.investigadores;

public abstract class Investigador {

    protected String nombre;
    protected String especialidad;
    protected double sueldo;

    public Investigador(String nombre, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

}
