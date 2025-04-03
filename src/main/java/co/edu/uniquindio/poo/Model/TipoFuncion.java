package co.edu.uniquindio.poo.Model;

public enum TipoFuncion {
    LOGISTICA(0), 
    COMUNICACIONES(1), 
    MEDICO(2);

    @SuppressWarnings("unused")
    private final int valor;
    
    TipoFuncion(int valor){
        this.valor = valor;
    }
    
}
