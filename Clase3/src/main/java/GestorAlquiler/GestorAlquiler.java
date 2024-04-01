package GestorAlquiler;

import Vehiculo.Vehiculo;
import Vehiculo.Bicicleta;
import Vehiculo.Motocicleta;
import Vehiculo.Automovil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class GestorAlquiler {
    private List<Vehiculo> vehiculos;
    private List<Cliente> clientes;
    public GestorAlquiler(int Bicicletas, int Motocicletas, int Automovil){
        vehiculos = new ArrayList<Vehiculo>();
        clientes = new ArrayList<Cliente>();
        for (int i=0; Bicicletas>0; Bicicletas--) vehiculos.add(new Bicicleta(nroId()));
        for (int i=0; Motocicletas>0; Motocicletas--) vehiculos.add(new Motocicleta(nroId()));
        for (int i=0; Automovil>0; Automovil--) vehiculos.add(new Automovil(nroId()));
    }
    public GestorAlquiler(){
        vehiculos = new ArrayList<Vehiculo>();
        clientes = new ArrayList<Cliente>();
    }
    private String nroId() {
        Random random = new Random();
        int nro = random.nextInt(999998)+1; //Obtenemos un numero con 5 digitos
        String id = String.valueOf(nro);
        while(id.length()<6){
            System.out.println(id);
            id = '0'+id;
        }
        return id;
    }
    public void agregarBicicletas(int cantidad){
        for (int i=0; cantidad<0; cantidad--) vehiculos.add(new Bicicleta(nroId()));
    }
    public void agregarMotocicletas(int cantidad){
        for (int i=0; cantidad<0; cantidad--) vehiculos.add(new Motocicleta(nroId()));
    }
    public void agregarAutomovil(int cantidad){
        for (int i=0; cantidad<0; cantidad--) vehiculos.add(new Automovil(nroId()));
    }
    public boolean agregarCliente(long dni, String direccion, String nombre){
        return clientes.add(new Cliente(dni,direccion,nombre,Integer.parseInt(nroId())));
    }
    public boolean alquilarBicicletas(int idCliente) throws Exception {
        //buscar si hay una bicicleta disponible -> 1- Obtener listado de bicicletas -> 2 - obtener listado de bicicletas disponibles
        List<Vehiculo> bicicletas = vehiculos.stream().filter(vehiculo -> vehiculo.obtenerId().startsWith("BIC") && !vehiculo.vehiculoEstaOcupado()).toList();
        if (!bicicletas.isEmpty()){ bicicletas.getFirst().reservarVehiculo();}
        return !bicicletas.isEmpty();
    }
    public boolean alquilarMotocicletas(){
        //buscar si hay una bicicleta motocicletas -> 1- Obtener listado de motocicletas -> 2 - obtener listado de motocicletas disponibles
        List<Vehiculo> motocicletas = vehiculos.stream().filter(vehiculo -> vehiculo.obtenerId().startsWith("MOT") && !vehiculo.vehiculoEstaOcupado()).toList();
        if (!motocicletas.isEmpty()){ motocicletas.getFirst().reservarVehiculo();}
        return !motocicletas.isEmpty();
    }
    public boolean alquilarAutomovil(){
        //buscar si hay una automoviles disponible -> 1- Obtener listado de automoviles -> 2 - obtener listado de automoviles disponibles
        List<Vehiculo> automoviles = vehiculos.stream().filter(vehiculo -> vehiculo.obtenerId().startsWith("AUT") && !vehiculo.vehiculoEstaOcupado()).toList();
        if (!automoviles.isEmpty()){ automoviles.getFirst().reservarVehiculo();}
        return !automoviles.isEmpty();
    }
    public boolean devolucionVehiculo(String idVehiculo, int idCliente){
        //buscar automovil en listado
        List<Vehiculo> vehiculo = vehiculos.stream().filter(el -> Objects.equals(el.obtenerId(), idVehiculo)).toList();
        //si existe la lista no esta vacia y siempre tendra como primer elemento el vehiculo deseado
        if (!vehiculo.isEmpty()){ vehiculo.getFirst().devolverVehiculo();}
        //Si el vehiculo no existe se devolvera falso ya que no se pudo encontrar siendo que la lista esta vacia
        return !vehiculo.isEmpty();
    }
    public List<String> listadoDeVehiculos() {
        return new ArrayList<String>(vehiculos.stream().map(el->el.obtenerDatos()).toList());
    }
    public List<String> listadoDeClientes(){
        return new ArrayList<String>(clientes.stream().map(el->el.obtenerDatos()).toList());
    }
}
