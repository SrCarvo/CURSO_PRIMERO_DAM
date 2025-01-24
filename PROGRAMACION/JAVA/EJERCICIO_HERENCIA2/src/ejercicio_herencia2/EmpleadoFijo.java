/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_herencia2;

/**
 *
 * @author tomaa
 */
class EmpleadoFijo extends Empleado{
    private double salarioMensual;
    
    public EmpleadoFijo(String nombre, double salarioMensual){
        super(nombre);
        this.salarioMensual = salarioMensual;
    }
    @Override
    public double calcularSalario(){
        return salarioMensual;
    }
}
