/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo2;

/**
 *
 * @author saidm
 */
public class ServicioNotificacionEmail implements EnvioEmail {
    @Override
    public void enviarEmail(String destinatario, String mensaje) {
    System.out.println("Enviando email a: " + destinatario);
    System.out.println("Mensaje: " + mensaje);
    }
}
