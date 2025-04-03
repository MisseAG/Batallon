package co.edu.uniquindio.poo.Model;

public class Blindado extends VehiculoMilitar {
    @SuppressWarnings("unused")
    private int nivelBlindaje;
    
    

    public Blindado(String id, String modelo, int anioFabricacion, int kilometraje, int cantidadMisiones,
            EstadoOperativo estadoOperativo, int nivelBlindaje) {
        super(id, modelo, anioFabricacion, kilometraje, cantidadMisiones, estadoOperativo);
        this.nivelBlindaje = nivelBlindaje;
    }



    //polimorfismo
    @Override
    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("=== Vehículo Blindado ===\n")
            .append("ID: ").append(id).append("\n")
            .append("Modelo: ").append(modelo).append("\n")
            .append("Año de Fabricación: ").append(anioFabricacion).append("\n")
            .append("Kilometraje: ").append(kilometraje).append(" km\n")
            .append("Cantidad de Misiones: ").append(cantidadMisiones).append("\n")
            .append("Estado Operativo: ").append(estadoOperativo).append("\n")
            .append("Nivel de Blindaje: ").append(nivelBlindaje).append("\n")
            .append("=========================\n");
        return info.toString();
    }
}