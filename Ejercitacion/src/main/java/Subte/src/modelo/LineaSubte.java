package Subte.src.modelo;

import Subte.src.excepciones.LineaException;

import java.util.ArrayList;
import java.util.List;

public class LineaSubte {
	
	private String nombre;
	private List<Vagon> vagones;
	private List<Estacion> estaciones;
	
	public LineaSubte(String nombre) {
		this.nombre=nombre;
		vagones=new ArrayList<Vagon>();
		estaciones=new ArrayList<Estacion>();
	}
	
	public boolean agregarVagon(Vagon vagon) throws LineaException {
		if(esCompatibleConVagones(vagon)&&(!superaMaximoEstacion(vagon))) {
			this.vagones.add(vagon);
			return true;
		}else {
			throw new LineaException("No se puede agregar el vagon dado que es incomplatible");
		}
	}
	
	public boolean superaMaximoEstacion(Vagon vagon) {
		int capacidadNueva=this.getCapacidadTotal() + vagon.getCapadidad();
		for(Estacion estacion:estaciones) {
			if(estacion.superaLaCapacidad(capacidadNueva)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean esCompatibleConVagones(Vagon vagon) {
		if(this.vagones.size()==0) {
			return true;
		}else {
			if(getPrimerVagon().somosCompatibles(vagon)) {
				return true;
			}	
		}
		return false;
	}
	
	public Vagon getPrimerVagon() {
		return this.vagones.get(0);
	}
	
	/* PUNTO C: METODO A IMPLEMENTAR POR EL ALUMNO */
	public int getCapacidadTotal() {
        int totalCapacidad = 0;
        for(Vagon vagon : vagones){
            totalCapacidad += vagon.getCapadidad();
        }
        return totalCapacidad;
    }
	
	public int contarVagonesCompatibles(Vagon vagon) {
		int cantidad = 0;
		for(Vagon v:vagones) {
			if(v.somosCompatibles(vagon)) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public void agregarEstacion(Estacion estacion) {
		this.estaciones.add(estacion);
	}

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public String getNombre() {
		return nombre;
	}

	public List<Vagon> getVagones() {
		return vagones;
	}

    public boolean sosLinea(String nombre) {
        return this.nombre.equalsIgnoreCase(nombre);
    }

}
