package AlquilerVehiculos.Vehiculo;

import java.util.Random;

public class Bicicleta extends Vehiculo{
    private int COSTO_HORA;
    public Bicicleta(){
        COSTO_HORA = 15;
        this.tipo = TipoVehiculo.BICICLETA;
        this.id = "BIC" + ++cantAutomoviles;
        this.estaOcupado = false;
        this.fechaUltimoRegistro = "";
        this.fechaUltimaDevolucion = "";
    }
    @Override
    public double costoActual() {
        return 0;
    }
}
