package co.edu.uniquindio.poo.App;

import java.time.LocalDate;

import co.edu.uniquindio.poo.Model.Apoyo;
import co.edu.uniquindio.poo.Model.Batallon;
import co.edu.uniquindio.poo.Model.Blindado;
import co.edu.uniquindio.poo.Model.EstadoOperativo;
import co.edu.uniquindio.poo.Model.Mision;
import co.edu.uniquindio.poo.Model.TipoFuncion;
import co.edu.uniquindio.poo.Model.TransporteTropas;
import co.edu.uniquindio.poo.Model.VehiculoMilitar;

public class Main {
    public static void main(String[] args) {
        // Crear un batallón
        Batallon batallon = new Batallon("0001", "Batallón");

        // Crear vehículos
        TransporteTropas vehiculo1 = new TransporteTropas("0001", "Ol", 1990, 30000, 58, EstadoOperativo.DISPONIBLE, 20);
        Apoyo vehiculo2 = new Apoyo("0002", "Auxiliar", 2005, 5000, 67, EstadoOperativo.EN_MISION, TipoFuncion.COMUNICACIONES);
        Blindado vehiculo3 = new Blindado("0003", "Bunker", 2010, 7000, 15, EstadoOperativo.EN_MANTENIMIENTO, 5);
        
        // Registrar vehículos
        batallon.registrarVehiculo(vehiculo1);
        batallon.registrarVehiculo(vehiculo2);
        batallon.registrarVehiculo(vehiculo3);
        
        // Mostrar vehículos
        System.out.println("Vehículos en el batallón:");
        System.out.println(batallon.mostrarVehiculos());
        
        // Crear y registrar una misión
        Mision mision1 = new Mision("0001",LocalDate.of(2025, 5, 10), "Zona de Operaciones X", null);
        batallon.asignarMision(mision1);
        
        // Mostrar detalles de la misión
        batallon.mostrarMisiones();
        
        // Obtener vehículos con más de 50 misiones
        System.out.println("Vehículos con más de 50 misiones:");
        for (VehiculoMilitar v : batallon.obtenerListadoVehiculos50Misiones()) {
            System.out.println(v.mostrarInformacion());
        }
        
    }
}