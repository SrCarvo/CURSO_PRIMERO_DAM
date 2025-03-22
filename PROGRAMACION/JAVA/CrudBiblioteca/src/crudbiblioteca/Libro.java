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
    private int isbn;
    private String titulo;
    private String categoria;
    private double precio;
    private int numeroPags;
    
    public Libro() { }

    public Libro(int isbn, String titulo, String categoria, double precio, int numeroPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.categoria = categoria;
        this.precio = precio;
        this.numeroPags = numeroPags;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
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

    public int getNumeroPags() {
        return numeroPags;
    }

    public void setNumeroPags(int numeroPags) {
        this.numeroPags = numeroPags;
    }
    
}
