package AlquilerVehiculos.GestorAlquiler;

import AlquilerVehiculos.Vehiculo.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Cliente {
     static int contClientes = 0;
     private int id;
     private long dni;
     private String direccion;
     private String nombre;
     private List<Vehiculo> vehiculos;
     public Cliente(long dni, String direccion, String nombre){
          Random random = new Random();
          this.dni = dni;
          this.direccion = direccion;
          this.nombre = nombre;
          this.vehiculos = new ArrayList<Vehiculo>();
          this.id = ++contClientes;;
     }
     public void reservarVehiculo(Vehiculo vehiculo){
          this.vehiculos.add(vehiculo);
     }
     public void devolverVehiculo(String vehiculoId){
          if(this.vehiculos.size()==1){
               this.vehiculos.clear();
          }else {
               int i = 0;
               while(!Objects.equals(this.vehiculos.get(i).obtenerId(), vehiculoId) && i<this.vehiculos.size()){
                    i++;
               }
               this.vehiculos.remove(i);
          }
     }
     public String obtenerDatos() {
          List<String> infoVehiculos = new ArrayList<String>();
         for (Vehiculo vehiculo : vehiculos) {
             infoVehiculos.add(vehiculo.obtenerDatos());
         }
     return "id:"+this.id+" | nombre:"+this.nombre+" vehiculos: "+ String.join(",", infoVehiculos);
     }
}
