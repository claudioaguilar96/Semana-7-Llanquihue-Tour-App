package model;

public class ExcursionCultural extends ServicioTuristico {

    // Atributos
    private String lugarHistorico;

    // Constructor
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    // Getter and setter
    public String getLugarHistorico() {
        return lugarHistorico;
    }
    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    // Metodo toString + Super
    @Override
    public String toString() {
        return super.toString() + " Tipo: Excursión Cultural - Lugar histórico: " + lugarHistorico;
    }

    // Metodo mostrar Informacion
    @Override
    public void mostrarInformacion() {
        System.out.println(toString());
    }
}