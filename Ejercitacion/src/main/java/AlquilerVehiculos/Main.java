package AlquilerVehiculos;

import AlquilerVehiculos.GestorAlquiler.GestorAlquiler;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestorAlquiler sistema = new GestorAlquiler(2,2,2);

        System.out.println("\nSistema en estado inicial");
        System.out.println("Clientes:");
        System.out.println(sistema.listadoDeClientes());
        System.out.println("Vehiculos:");
        System.out.println(sistema.listadoDeVehiculos());

        sistema.agregarCliente(21232,"av 1234","analia");
        sistema.alquilarAutomovil(1);
        sistema.alquilarBicicleta(1);
        sistema.alquilarMotocicleta(1);
        System.out.println("\nSistema al reservar vehiculo con nuevo cliente");
        System.out.println("Clientes:");
        System.out.println(sistema.listadoDeClientes());
        System.out.println("Vehiculos:");
        System.out.println(sistema.listadoDeVehiculos());

        sistema.devolucionVehiculo("AUT5",1);
        sistema.devolucionVehiculo("BIC1",1);

        System.out.println("\nSistema al devolver vehiculo con nuevo cliente");
        System.out.println("Clientes:");
        System.out.println(sistema.listadoDeClientes());
        System.out.println("Vehiculos:");
        System.out.println(sistema.listadoDeVehiculos());
    }
}