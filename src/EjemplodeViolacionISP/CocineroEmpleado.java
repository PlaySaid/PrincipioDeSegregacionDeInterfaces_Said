/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplodeViolacionISP;

/**
 *
 * @author saidm
 */
public class CocineroEmpleado implements Empleado {
    @Override
    public void cocinar() {
    System.out.println("El cocinero está cocinando.");
    }
    @Override
    public void limpiar() {
// Implementación vacía, ya que el cocinero no debería limpiar.
    }
    @Override
    public void atenderMesas() {
// Implementación vacía, ya que el cocinero no debería atender mesas.
    }
}