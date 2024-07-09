package Subte.src.modelo;

public abstract class Vagon {
	
	protected int capacidad;

	protected Vagon(int capacidad) {
		this.capacidad = capacidad;
	}

	public double velocidadMaxima() {
		return 120/this.capacidad;
	}
	
	public boolean sosAleman() {
		return false;
	}
	
	public boolean sosArgentino() {
		return false;
	}
	
	public boolean sosChino() {
		return false;
	}
	
	public abstract boolean somosCompatibles(Vagon vagon);

	public int getCapadidad() {
		return this.capacidad;
	}
	
}
