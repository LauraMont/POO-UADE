package Subte.src.modelo;

import java.util.ArrayList;
import java.util.List;

import Subte.src.excepciones.EstacionException;
import Subte.src.excepciones.LineaException;
public class SistemaSubte {
	
	private List<LineaSubte> lineaSubte;
	private List<Estacion> estaciones;
	private static SistemaSubte sistemaSubte;
	

	private SistemaSubte() {
		lineaSubte=new ArrayList<LineaSubte>();
		estaciones=new ArrayList<Estacion>();
	}
	
	public static SistemaSubte getInstance() {
		if(sistemaSubte==null) {
			sistemaSubte=new SistemaSubte();
			return sistemaSubte;
		}else {
			return sistemaSubte;	
		}
	}
	
	public void agregarEstacionLinea(String nombreEstacion, String nombreLinea) throws EstacionException, LineaException, EstacionException {
		Estacion estacion = buscarEstacion(nombreEstacion);
		LineaSubte linea = buscarLinea(nombreLinea);
		
		estacion.agregarLinea(linea);
		linea.agregarEstacion(estacion);
	}
	
	public void crearEstacion(String nombre, int capacidad) {
		Estacion estacion =new Estacion(nombre, capacidad);
		this.estaciones.add(estacion);
	}
	
	public void crearLineaSubte(String nombre) {
		LineaSubte linea =new LineaSubte(nombre);
		this.lineaSubte.add(linea);
	}
	
	public int contarVagonesCompatibles(Vagon vagon) {
		int cantidad=0;
		for(LineaSubte linea:lineaSubte) {
			cantidad=cantidad+linea.contarVagonesCompatibles(vagon);
		}
		return cantidad;
	}

	public void agregarVagonArgentino(String nombre) throws LineaException {
		agregarVagonLinea(nombre, new VagonArgentino());
	}

	public void agregarVagonAleman(String nombre) throws LineaException {
		agregarVagonLinea(nombre, new VagonAleman());
	}

	public void agregarVagonChino(String nombre) throws LineaException {
		agregarVagonLinea(nombre, new VagonChino());
	}

	private void agregarVagonLinea(String nombre, Vagon vagon) throws LineaException {
		this.buscarLinea(nombre).agregarVagon(vagon);
	}

	public LineaSubte buscarLinea(String nombre) throws LineaException {
		for(LineaSubte linea:this.lineaSubte) {
			if(linea.sosLinea(nombre)) {
				return linea;
			}
		}
		throw new LineaException("Linea no encontrada: " + nombre);
	}
    public boolean existeLinea(String nombre){
        for(LineaSubte linea:this.lineaSubte) {
            if(linea.sosLinea(nombre)) {
                return true;
            }
        }
        return false;
    }
	
	public Estacion buscarEstacion(String nombre) throws EstacionException {
		for(Estacion estacion:this.estaciones) {
			if(estacion.sosEstacion(nombre)) {
				return estacion;
			}
		}
		throw new EstacionException("Estacion no encontrada: " + nombre);
	}

}
