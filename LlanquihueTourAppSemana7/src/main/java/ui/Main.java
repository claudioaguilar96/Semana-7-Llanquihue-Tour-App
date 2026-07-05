package ui;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Crear la instancia del gestor
        GestorServicios gestor = new GestorServicios();
        List<ServicioTuristico> servicios = gestor.crearServicios();

        // Mensaje intro
        System.out.println("");
        System.out.println(" Servicios Turísticos - Llanquihue Tour App \n");
        System.out.println("Servicios : \n ");

        gestor.mostrarTodos(servicios);
    }
}