package Subte.src.modelo.objectView;

import Subte.src.modelo.LineaSubte;

import java.util.List;

public class EstacionViewObject {
    private final int capacidadMaxima;
    private String nombre;

    public EstacionViewObject(int capacidadMaxima, String nombre) {
        this.capacidadMaxima = capacidadMaxima;
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }
}
