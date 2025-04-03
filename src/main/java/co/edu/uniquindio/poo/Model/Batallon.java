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
