package Ejercicio2;

public class BancoRetirar implements Retirar{
    
    @Override
    public void hacerRetiro(double monto) {
        System.out.println("Realizar retiro de: "+monto);
    }
}
