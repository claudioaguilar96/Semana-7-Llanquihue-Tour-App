package model;

public class RutaGastronomica extends ServicioTuristico {

    // Atributos
    private int numeroDeParadas;

    // Constructor + Super
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    // Getter and Setter
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }
    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    // Metodo toString + Super
    @Override
    public String toString() {
        return super.toString() + " Tipo: Ruta Gastronómica - Paradas: " + numeroDeParadas;
    }

    // Metodo mostrar Informacion
    @Override
    public void mostrarInformacion() {
        System.out.println(toString());
    }
}