
package tiendaderopa.Models;

import java.util.Date;

/**
 *
 * @author Emanuel López
 */
public class VentasModels {
    private int codigoPro;
    private float CantidadVendida;
    private Date fechaTransaccion;
    private String horaTransaccion;
    private float TotalVenta;

    public int getCodigoPro() {
        return codigoPro;
    }

    public void setCodigoPro(int codigoPro) {
        this.codigoPro = codigoPro;
    }

    public float getCantidadVendida() {
        return CantidadVendida;
    }

    public void setCantidadVendida(float CantidadVendida) {
        this.CantidadVendida = CantidadVendida;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getHoraTransaccion() {
        return horaTransaccion;
    }

    public void setHoraTransaccion(String horaTransaccion) {
        this.horaTransaccion = horaTransaccion;
    }

    public float getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(float TotalVenta) {
        this.TotalVenta = TotalVenta;
    }

    
    
    
}
