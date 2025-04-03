package co.edu.uniquindio.poo.Model;

public class TransporteTropas extends VehiculoMilitar{

    public int capacidadSoldados;

    public TransporteTropas(String id, String modelo, int anioFabricacion, int kilometraje, int cantidadMisiones,
            EstadoOperativo estadoOperativo, int capacidadSoldados) {
        super(id, modelo, anioFabricacion, kilometraje, cantidadMisiones, estadoOperativo);
        this.capacidadSoldados = capacidadSoldados;
    }





    @Override
    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("=== Transporte de Tropas ===\n")
            .append("ID: ").append(id).append("\n")
            .append("Modelo: ").append(modelo).append("\n")
            .append("Año de Fabricación: ").append(anioFabricacion).append("\n")
            .append("Kilometraje: ").append(kilometraje).append(" km\n")
            .append("Cantidad de Misiones: ").append(cantidadMisiones).append("\n")
            .append("Estado Operativo: ").append(estadoOperativo).append("\n")
            .append("Capacidad de Soldados: ").append(capacidadSoldados).append("\n")
            .append("============================\n");
        return info.toString();
    }
}
