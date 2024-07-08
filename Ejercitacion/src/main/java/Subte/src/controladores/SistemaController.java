package Subte.src.controladores;

import Subte.src.excepciones.LineaException;
import Subte.src.modelo.Estacion;
import Subte.src.modelo.LineaSubte;
import Subte.src.modelo.SistemaSubte;
import Subte.src.modelo.Vagon;
import Subte.src.modelo.objectView.EstacionViewObject;
import Subte.src.modelo.objectView.LineaObjectView;
import Subte.src.modelo.objectView.VagonViewObject;

import java.util.ArrayList;
import java.util.List;

public class SistemaController {
    public SistemaController(){
        new Principal();
    }
    public boolean lineaExiste(String nombre) throws LineaException {
        return SistemaSubte.getInstance().existeLinea(nombre);
    }
    public int getCapacidadTotal(String nombre) throws LineaException {
        LineaSubte linea = SistemaSubte.getInstance().buscarLinea(nombre);
        return linea.getCapacidadTotal();
    }
    public LineaObjectView getLineaData(String nombre) throws LineaException {
        LineaSubte linea = SistemaSubte.getInstance().buscarLinea(nombre);
        List<EstacionViewObject> estaciones = new ArrayList<>();
        List<VagonViewObject> vagones = new ArrayList<>();
        for(Estacion estacion: linea.getEstaciones()){
            estaciones.add(new EstacionViewObject(estacion.getCapacidadMaxima(), estacion.getNombre()));
        }
        for(Vagon vagon: linea.getVagones()){
            vagones.add(new VagonViewObject(vagon.getCapadidad()));
        }
        return new LineaObjectView(nombre,vagones,estaciones);
    }
}
