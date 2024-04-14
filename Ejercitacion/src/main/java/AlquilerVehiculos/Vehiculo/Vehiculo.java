package Vehiculo;

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
     protected String nroId() {
          Random random = new Random();
          int nro = random.nextInt(999998)+1; //Obtenemos un numero con 5 digitos
          String id = String.valueOf(nro);
          while(id.length()<6){
               System.out.println(id);
               id = '0'+id;
          }
          return id;
     }
     public boolean vehiculoEstaOcupado(){
          return this.estaOcupado;
     }
     public String obtenerId(){
          return this.id;
     }
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
