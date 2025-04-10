package co.edu.uniquindio.poo.Model;

public abstract class VehiculoMilitar {
    private String id;
    private String modelo;
    private int anioFabricacion;
    private int kilometraje;
    private int cantidadMisiones;
    private EstadoOperativo estadoOperativo;
    private arrayList<Mision> listaMisiones;

    public VehiculoMilitar(String id, String modelo, int anioFabricacion, int kilometraje, int cantidadMisiones,
            EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.cantidadMisiones = cantidadMisiones;
        this.estadoOperativo = estadoOperativo;
        this.listaMisiones = new arrayList<>();
    }
    //Metodo abstracto
    public abstract String mostrarInformacion();

    public void actualizarInformacion(String nuevoModelo, int nuevoAnio, int nuevoKilometraje, EstadoOperativo nuevoEstado) {
        this.modelo = nuevoModelo;
        this.anioFabricacion = nuevoAnio;
        this.kilometraje = nuevoKilometraje;
        this.estadoOperativo = nuevoEstado;
    }

    public void registrarMision(Mision mision){
        
    }
}
