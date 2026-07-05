package model;

public class ServicioTuristico {

    // Atributos
    private String nombre;
    private int duracionHoras;

    // Constructor
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public int getDuracionHoras() {
        return duracionHoras;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Servicio: " + nombre + " | Duración: " + duracionHoras + " horas";
    }

    // Metodo mostrar Informacion

    public void mostrarInformacion() {
        System.out.println(toString());
    }
}