package Vehiculo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Vehiculo {
     protected String id;
     protected boolean estaOcupado;
     protected String fechaUltimoRegistro ;
     protected String fechaUltimaDevolucion;
     public boolean vehiculoEstaOcupado(){return this.estaOcupado;}
     public String obtenerId(){return this.id;}
     public String obtenerDatos(){
          return "\nid:"+this.id+" | Vehiculo ocupado :"+this.estaOcupado+"\n";
     }
     public static String currentDate(){
          // formato de fecha: YYYY.MM.DD-HH.MM.SS
          return new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
     }
     public void reservarVehiculo(){
          this.estaOcupado = true;
          this.fechaUltimoRegistro= currentDate();
     }
     public void devolverVehiculo(){
          this.estaOcupado = true;
          this.fechaUltimoRegistro= currentDate();
     }
     public abstract double costoActual();
}
