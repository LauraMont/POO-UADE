package GestorAlquiler;

import java.util.Random;

public class Cliente {
     private int id;
     private long dni;
     private String direccion;
     private String nombre;
     private String vehiculoId;
     public Cliente(long dni, String direccion, String nombre){
          Random random = new Random();
          this.dni = dni;
          this.direccion = direccion;
          this.nombre = nombre;
          this.vehiculoId = "";
          this.id = random.nextInt(999998)+1;;
     }
     public void reservarVehiculo(String vehiculoId){

          this.vehiculoId = vehiculoId;
     }
     public void devolverVehiculo(String vehiculoId){
          this.vehiculoId = "";
     }
     public String obtenerDatos() {
     return "\nid:"+this.id+" | nombre:"+this.nombre+"\n";
     }
}
