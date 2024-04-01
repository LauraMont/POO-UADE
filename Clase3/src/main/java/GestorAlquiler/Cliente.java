package GestorAlquiler;
public class Cliente {
     private int id;
     private long dni;
     private String direccion;
     private String nombre;
     private String vehiculoId;
     public Cliente(long dni, String direccion, String nombre, int nroCliente){
          this.dni = dni;
          this.direccion = direccion;
          this.nombre = nombre;
          this.vehiculoId = "";
          this.id = nroCliente;
     }
     public void reservarVehiculo(String vehiculoId){
          this.vehiculoId = vehiculoId;
     }
     public void devolverVehiculo(String vehiculoId){
          this.vehiculoId = "";
     }
     public String obtenerDatos(){
          return "\nid:"+this.id+" | nombre:"+this.nombre+"\n";
     }
}
