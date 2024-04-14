package AlquilerVehiculos.Vehiculo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public abstract class Vehiculo {
     protected String id;
     protected boolean estaOcupado;
     protected String fechaUltimoRegistro ;
     protected String fechaUltimaDevolucion;
     protected TipoVehiculo tipo;
     static int cantAutomoviles = 0;
     public boolean vehiculoEstaOcupado(){
          return this.estaOcupado;
     }
     public String obtenerId(){
          return this.id;
     }
     public String obtenerDatos(){
          return "id:"+this.id+" | Vehiculo ocupado :"+this.estaOcupado;
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
          this.estaOcupado = false;
          this.fechaUltimaDevolucion= currentDate();
     }
     public TipoVehiculo obtenerTipoVehiculo(){
          return tipo;
     }
     public abstract double costoActual();
}
