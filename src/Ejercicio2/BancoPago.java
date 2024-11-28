package Ejercicio2;

public class BancoPago implements Pagar{
    
    @Override
    public void hacerPago(String factura, double monto){
        System.out.println("Pagar factura: "+factura);
        System.out.println("De monto: "+monto);
    }
}
