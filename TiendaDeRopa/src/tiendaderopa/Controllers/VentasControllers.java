package tiendaderopa.Controllers;

import java.util.Date;
import tiendaderopa.Models.VentasModels;

/**
 *
 * @author Emanuel López
 */
public class VentasControllers {
    public static VentasModels[] ventasControllers = new VentasModels[100];
    
    //Metodo para agregregar ventas
    public void AgregarVentas(int codigoProdu, float cantidadVendida, Date fechaTransaccion, String horaTransaccion, float totalVenta){
        for(int i = 0; i<ventasControllers.length; i++){
            if(ventasControllers[i] == null){
                VentasModels ventaModels = new VentasModels();
                ventaModels.setCodigoPro(codigoProdu);
                ventaModels.setCantidadVendida(cantidadVendida);
                ventaModels.setFechaTransaccion(fechaTransaccion);
                ventaModels.setHoraTransaccion(horaTransaccion);
                ventaModels.setTotalVenta(totalVenta);
                ventasControllers[i] = ventaModels;
                System.out.println("Se agrego Exitosamente!");
                return;
            }
        }
    }
    
    
}
