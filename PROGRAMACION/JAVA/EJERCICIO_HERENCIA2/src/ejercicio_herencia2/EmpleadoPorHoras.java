/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_herencia2;

/**
 *
 * @author tomaa
 */
class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHoras;
    
    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora){
        super(nombre);
        this.horasTrabajadas=horasTrabajadas;
        this.tarifaPorHoras=tarifaPorHora;
    }
    @Override
    public double calcularSalario(){
        
        return horasTrabajadas * tarifaPorHora;
    }
}
