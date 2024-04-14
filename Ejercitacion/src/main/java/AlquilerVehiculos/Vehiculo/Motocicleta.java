package Vehiculo;

public class Motocicleta extends Vehiculo{
    private String ID_MOT;
    private int COSTO_DIA;
    public Motocicleta(){
        this.id = "MOT" + this.nroId();
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
