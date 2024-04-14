package AlquilerVehiculos.Vehiculo;

public class Motocicleta extends Vehiculo{
    private String ID_MOT;
    private int COSTO_DIA;
    public Motocicleta(){
        this.id = "MOT" + ++cantAutomoviles;
        COSTO_DIA = 5;
        this.estaOcupado = false;
        this.fechaUltimoRegistro = "";
        this.fechaUltimaDevolucion = "";
        this.tipo = TipoVehiculo.MOTOCICLETA;
    }
    @Override
    public double costoActual() {
        return 0;
    }
}
