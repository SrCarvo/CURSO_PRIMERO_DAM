/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_herencia2;

/**
 *
 * @author tomaa
 */
abstract class Empleado {
    protected String nombre;
    protected int salario;
    
    public Empleado(String nombre){
        this.nombre=nombre;
    }
    public abstract double calcularSalario();
}
