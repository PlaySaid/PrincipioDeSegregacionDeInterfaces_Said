public class Ejecucion {

    public static void main(String[] args) {
        
        Reparacion jose = new TecnicoReparacion();
        Limpieza juan = new TecnicoLimpieza();
        
        jose.reparar();
        juan.limpiar();
    }
    
}
