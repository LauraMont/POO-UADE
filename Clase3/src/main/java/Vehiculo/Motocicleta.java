package Vehiculo;

public class Motocicleta extends Vehiculo{
    private String ID_MOT;
    private int COSTO_DIA;
    public Motocicleta(String id){
        this.id = "MOT" + id;
        COSTO_DIA = 5;
        this.estaOcupado = false;
        this.fechaUltimoRegistro = "";
        this.fechaUltimaDevolucion = "";
    }
    @Override
    public double costoActual() {
        return 0;
    }
}
