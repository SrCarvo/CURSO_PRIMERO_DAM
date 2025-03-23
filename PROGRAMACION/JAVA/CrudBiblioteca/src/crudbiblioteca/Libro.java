/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudbiblioteca;

import java.io.Serializable;

/**
 *
 * @author tomaa
 */
public class Libro implements Serializable { 
  private static final long serialVersionUID = 1L;
    
    private String isbn;
    private String titulo;
    private String categoria;
    private double precio;
    private int numPaginas;
    public Libro() {}
    
    
    // Getters y Setters
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }
    
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Título: " + titulo + ", Categoría: " + categoria + 
               ", Precio: " + precio + ", Páginas: " + numPaginas;
    }
    
}
