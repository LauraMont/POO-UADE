package Subte.src.modelo.objectView;

import Subte.src.modelo.Estacion;
import Subte.src.modelo.Vagon;

import java.util.List;

public class LineaObjectView {
    private String nombre;
    private List<VagonViewObject> vagones;
    private List<EstacionViewObject> estaciones;

    public LineaObjectView(String nombre, List<VagonViewObject> vagones, List<EstacionViewObject> estaciones) {
        this.nombre = nombre;
        this.vagones = vagones;
        this.estaciones = estaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public List<VagonViewObject> getVagones() {
        return vagones;
    }

    public List<EstacionViewObject> getEstaciones() {
        return estaciones;
    }
}
