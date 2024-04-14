package Vehiculo;

import java.util.Random;

public class Bicicleta extends Vehiculo{
    private int COSTO_HORA;
    public Bicicleta(){
        COSTO_HORA = 15;
        this.id = "BIC" + this.nroId();
        this.estaOcupado = false;
        this.fechaUltimoRegistro = "";
        this.fechaUltimaDevolucion = "";
    }
    @Override
    public double costoActual() {
        return 0;
    }
}
