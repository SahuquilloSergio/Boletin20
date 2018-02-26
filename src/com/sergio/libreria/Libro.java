package com.sergio.libreria;

public class Libro {
        
    String titulo;
    String autor;
    int precio;
    int unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, int precio, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro: " + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", unidades=" + unidades+"\n";
    }
    
    
             
    
}
