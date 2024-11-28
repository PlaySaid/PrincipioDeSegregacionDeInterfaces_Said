package Ejercicio3;

public class Ejecucion {

    public static void main(String[] args) {
        
        Conduccion carro = new Carro();
        CargoMercancia camionCargar = new Camion();
        Conduccion camionConducir = new Camion();
        
        carro.conducir();
        System.out.println("-------------");
        camionConducir.conducir();
        camionCargar.cargarMercancias();
    }
    
}
