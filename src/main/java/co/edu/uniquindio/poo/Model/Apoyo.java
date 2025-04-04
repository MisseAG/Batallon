package co.edu.uniquindio.poo.Model;

public class Apoyo extends VehiculoMilitar{
    public TipoFuncion tipoFuncion;
    
    public Apoyo(String id, String modelo, int anioFabricacion, int kilometraje, int cantidadMisiones,
            EstadoOperativo estadoOperativo, TipoFuncion tipoFuncion) {
        super(id, modelo, anioFabricacion, kilometraje, cantidadMisiones, estadoOperativo);
        this.tipoFuncion = tipoFuncion;
    }

    @Override
    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("=== Vehículo de Apoyo ===\n")
            .append("ID: ").append(id).append("\n")
            .append("Modelo: ").append(modelo).append("\n")
            .append("Año de Fabricación: ").append(anioFabricacion).append("\n")
            .append("Kilometraje: ").append(kilometraje).append(" km\n")
            .append("Cantidad de Misiones: ").append(cantidadMisiones).append("\n")
            .append("Estado Operativo: ").append(estadoOperativo).append("\n")
            .append("Función de Apoyo: ").append(tipoFuncion).append("\n")
            .append("=========================\n");
        return info.toString();
    }
}