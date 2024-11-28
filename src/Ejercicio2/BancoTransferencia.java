package Ejercicio2;

public class BancoTransferencia implements Transferencia{
    
    @Override
    public void hacerTransferencia(double monto) {
        System.out.println("Transferencia de: "+monto);
    }
}
