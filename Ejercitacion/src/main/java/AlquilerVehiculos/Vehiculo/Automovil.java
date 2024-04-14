package Vehiculo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Automovil extends Vehiculo{
    private int COSTO_DIA;
    public Automovil(){
        this.id = "AUT" + this.nroId();
        COSTO_DIA = 15;
        this.estaOcupado = false;
        this.fechaUltimoRegistro = "";
        this.fechaUltimaDevolucion = "";
    }
    @Override
    //cantidad de dias * costo dia
    public double costoActual() {
        //comparar fechas y sacas cantidad de dias -> si es <= 1 entonces devolvemos el valor de costo por dia , si no es se realiza el calculo
        return 0;
    }
}
