package cl.inacap.misconciertos.dto;

import androidx.appcompat.app.AlertDialog;

import java.util.Date;
import java.util.List;

import cl.inacap.misconciertos.MainActivity;

public class Concierto {

    private String nombreArtista;
    private Date fechaEvento;
    private String genero;
    private int precioEntrada;
    private int calificacion;

    public Concierto(){

    }

    public Concierto(String nombreArtista, Date fechaEvento, String genero, int precioEntrada, int calificacion) {
        this.nombreArtista = nombreArtista;
        this.fechaEvento = fechaEvento;
        this.genero = genero;
        this.precioEntrada = precioEntrada;
        this.calificacion = calificacion;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }


}
