package Subte.src.modelo;

import Subte.src.excepciones.EstacionException;

import java.util.ArrayList;
import java.util.List;

public class Estacion {
	
	private int capacidadMaxima;
	private String nombre;
	private List<LineaSubte>lineas;
	
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public Estacion(String nombre, int capacidadMaxima) {
		this.nombre=nombre;
		this.capacidadMaxima=capacidadMaxima;
		lineas=new ArrayList<LineaSubte>();
	}

	public void agregarLinea(LineaSubte linea) throws EstacionException {
		if(!this.superaLaCapacidad(linea.getCapacidadTotal())) {
			this.lineas.add(linea);
		} else {
			throw new EstacionException("Se supera la capacidad de la linea");
		}
	}
	
	public boolean superaLaCapacidad(int capacidad) {
		return capacidad>this.capacidadMaxima;
	}

	public boolean sosEstacion(String nombre) {
		return this.nombre.equalsIgnoreCase(nombre);
	}

}
