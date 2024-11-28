package Ejercicio2;

public class Ejecucion {

    public static void main(String[] args) {
        
        Pagar pago = new BancoPago();
        Retirar retiro = new BancoRetirar();
        Transferencia transferencia = new BancoTransferencia();
        
        pago.hacerPago("Recibo de luz", 134000);
        System.out.println("-------------------");
        retiro.hacerRetiro(40000);
        System.out.println("-------------------");
        transferencia.hacerTransferencia(60000);
    }
    
}
