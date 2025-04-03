package co.edu.uniquindio.poo.Model;

public abstract class VehiculoMilitar {
    public String id;
    public String modelo;
    public int anioFabricacion;
    public int kilometraje;
    public int cantidadMisiones;
    public EstadoOperativo estadoOperativo;

    public VehiculoMilitar(String id, String modelo, int anioFabricacion, int kilometraje, int cantidadMisiones,
            EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.cantidadMisiones = cantidadMisiones;
        this.estadoOperativo = estadoOperativo;
    }
    //Metodo abstracto
    public abstract String mostrarInformacion();

    public void actualizarInformacion(String nuevoModelo, int nuevoAnio, int nuevoKilometraje, EstadoOperativo nuevoEstado) {
        this.modelo = nuevoModelo;
        this.anioFabricacion = nuevoAnio;
        this.kilometraje = nuevoKilometraje;
        this.estadoOperativo = nuevoEstado;
    }
}