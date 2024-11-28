package Ejercicio3;

public class Camion implements CargoMercancia, Conduccion {
   
   @Override
   public void conducir(){
       System.out.println("El camion es conducido por Juan");
       
   }
   @Override
   public void cargarMercancias(){
       System.out.println("El camion carga mercancias");
   }
}
