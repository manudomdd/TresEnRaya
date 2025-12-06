package dto;

import java.util.Objects;

public class Jugador {
    
    private String nombre; 
    private TipoImagen tipoImagen; 
    
    public Jugador() {
        
    }
    
    public Jugador(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen; 
    }
    
    public Jugador(String nombre, TipoImagen tipoImagen) {
        this.nombre = nombre; 
        this.tipoImagen = tipoImagen; 
    }
}
