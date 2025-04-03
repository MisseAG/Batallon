package co.edu.uniquindio.poo.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Batallon {
    public String id;
    public String nombre;
    public ArrayList<VehiculoMilitar> listaVehiculos;
    public ArrayList<Mision> listaMisiones;




    public Batallon(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listaVehiculos = new ArrayList<>();
        this.listaMisiones = new ArrayList<>();
    }


   public boolean registrarVehiculo(VehiculoMilitar vehiculo) {
        for (VehiculoMilitar vAux : listaVehiculos) {
            if (vAux.equals(vehiculo)) {
                return false; 
            }
        }
        listaVehiculos.add(vehiculo);
        return true;
    }
//Métodos 3/04/25
    public String registrarVehiculo2(Vehiculo nuevoVehiculo) {

        String mensaje = "";
        Vehiculo vehiculoEncontrado = null;
        vehiculoEncontrado = buscarVehiculo(nuevoVehiculo.getId());
        if (vehiculoEncontrado == null) {
            listaVehiculos.add(nuevoVehiculo);
                mensaje = "Vehiculo registrado correctamente";
        }
        mensaje = "Vehiculo no encontrado":

        return mensaje;
    }
    public String registrarVehiculo3(Vehiculo nuevoVehiculo) {

        String mensaje = "";
        Optional<Vehiculo> optionalVehiculo = null buscarVehiculo2(nuevoVehiculo.getId());

        if(optionalVehiculo.isPresent()){
            mensaje = "ya existe";
        }else{
            listaVehiculos.add(nuevoVehiculo);
            mensaje = "registrado correctamente";
        }
        return mensaje;
    }
    
    private Vehiculo buscarVehiculo(String id) {
        Vehiculo vehiculoEncontrado = null;
        for (Vehiculo vehiculoAux : listaVehiculos) {
            if (vehiculoAux.getId().equals(id)) {
                vehiculoEncontrado = vehiculoAux;
                return vehiculoEncontrado; //rompe el ciclo
            }
        }
        return  vehiculoEncontrado;
    }

    private Optional<Vehiculo> buscarVehiculo2(String id) {
        return listaVehiculos.stream()
                          .filter(v -> vehiculo.getId().equals(id))//condicion filtro
                          .findFirst() // devuelve primero  
                          ;  
    }

    public String editarVehiculo(String id, Vehiculo vehiculo){
        String mensaje= "";
        Vehiculo vehiculoEncontrado = null;

        return mensaje;
    }

    public Vehiculo obtenerVehiculoMayorMisiones(){
        Vehiculo vehiculoMayorMisiones = null:
        int mayor = -1;
        for(Vehiculo v : listaVehiculos){
            if(v.getCantidadMisiones() > mayor){
                mayor = v.getCantidadMisiones();
                vehiculoMayorMisiones = v;
            }
        }
        return vehiculoMayorMisiones;
    }//optimizar

     
    //
    public boolean actualizarVehiculo(VehiculoMilitar vehiculoActualizar, String nuevoModelo, int nuevoAnio, int nuevoKilometraje, EstadoOperativo nuevoEstado) {
        for (VehiculoMilitar vAux : listaVehiculos){
            if (vAux.equals(vehiculoActualizar)) {
                vehiculoActualizar.actualizarInformacion(nuevoModelo, nuevoAnio, nuevoKilometraje, nuevoEstado);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarVehiculo(VehiculoMilitar vehiculo) {
        return listaVehiculos.remove(vehiculo);
    }
    
    public String mostrarVehiculos() {
        StringBuilder resultado = new StringBuilder();
        for (VehiculoMilitar vehiculo : listaVehiculos) {
            resultado.append(vehiculo.modelo).append("\n");
        }
        return resultado.toString();
    }
    
    public boolean asignarMision(Mision mision) {
        for (Mision mAux : listaMisiones) {
            if (mAux.equals(mision)) {
                return false; 
            }
        }
        listaMisiones.add(mision);
        return true;
    }

        // sobrecarga Asignar misión pasando los datos individuales
    public boolean asignarMision(String codigo, LocalDate fecha, String ubicacion, LinkedList<Personal> listaPersonalAsignado) {
        return listaMisiones.add(new Mision(codigo, fecha, ubicacion, listaPersonalAsignado));
    }

    public void mostrarMisiones() {
        for (Mision mision : listaMisiones) {
            System.out.println(mision); // `toString()` automático del record
        }
    }
    
    public List<VehiculoMilitar> obtenerListadoVehiculos50Misiones() {
        List<VehiculoMilitar> resultado = new ArrayList<>();
        for (VehiculoMilitar vehiculo : listaVehiculos) {
            if (vehiculo.cantidadMisiones >= 50) {
                resultado.add(vehiculo);
            }
        }
        return resultado;
    }
}
