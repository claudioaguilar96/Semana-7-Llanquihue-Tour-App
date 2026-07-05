package model;

public class PaseoLacustre extends ServicioTuristico {

    // Atributos
    private String tipoEmbarcacion;

    // Constructor
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Getter and setter
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Metodo toString + Super
    @Override
    public String toString() {
        return super.toString() + " Tipo: Paseo Lacustre - Embarcación: " + tipoEmbarcacion;
    }

    // Metodo mostrar Informacion
    @Override
    public void mostrarInformacion() {
        System.out.println(toString());
    }
}