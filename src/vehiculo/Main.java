
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoOsunaMontesSandra2223 miVehiculoOsunaMontesSandra2223;
        int stockActual;
        
        operativaVehiculosOsunaMontesSandra2223(50);
    }

    private static void operativaVehiculosOsunaMontesSandra2223(int cantidad) {
        VehiculoOsunaMontesSandra2223 miVehiculoOsunaMontesSandra2223;
        int stockActual;
        miVehiculoOsunaMontesSandra2223 = new VehiculoOsunaMontesSandra2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoOsunaMontesSandra2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoOsunaMontesSandra2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoOsunaMontesSandra2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
