package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    // Crear las instancias y las devuelve como una Lista
    public List<ServicioTuristico> crearServicios() {

        List<ServicioTuristico> servicios = new ArrayList<>();

        // Rutas gastronomicas
        servicios.add(new RutaGastronomica("Comida hecha en casa", 4, 5));
        servicios.add(new RutaGastronomica("Comida en el parque", 3, 3));

        // Paseos Lacustres
        servicios.add(new PaseoLacustre("viaje al sur", 2, "barco 1"));
        servicios.add(new PaseoLacustre("viaje al norte", 5, "barco 2"));

        // Excursiones
        servicios.add(new ExcursionCultural("Salida a la esquina", 3, "Casona"));
        servicios.add(new ExcursionCultural("salida a la nada", 4, "tren"));

        return servicios;
    }

    // Muestra La informacion de la Lista
    public void mostrarTodos(List<ServicioTuristico> servicios) {
        for (ServicioTuristico s : servicios) {
            s.mostrarInformacion();
        }
    }
}