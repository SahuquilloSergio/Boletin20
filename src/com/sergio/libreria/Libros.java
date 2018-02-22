package com.sergio.libreria;

public class Libros {
        
    private String titulo;
    private String autor;
    private float precio;
    private int unidades;

    public Libros() {
    }

    public Libros(String titulo, String autor, float precio, int unidades) {
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

    public void setPrecio(float precio) {
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
        return "Libros\n" + "titulo=" + titulo + "\n autor=" + autor + "\n precio=" + precio + "\n unidades=" + unidades;
    }
    
    
             
    
}
