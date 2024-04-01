package Clase3;

import GestorAlquiler.GestorAlquiler;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestorAlquiler sistema = new GestorAlquiler(1,1,1);
        System.out.println("\nSistema en estado inicial:");
        System.out.println(sistema.listadoDeClientes());
        System.out.println(sistema.listadoDeVehiculos());
        sistema.agregarCliente(21232,"av 1234","analia");
        sistema.alquilarAutomovil();
        System.out.println("\nSistema al reservar vehiculo con nuevo cliente:");
        System.out.println(sistema.listadoDeClientes());
        System.out.println(sistema.listadoDeVehiculos());
    }
}