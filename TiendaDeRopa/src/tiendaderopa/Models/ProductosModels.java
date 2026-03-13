/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa.Models;

/**
 *
 * @author Emanuel López
 */
public class ProductosModels {
        //Variables de los productos.
    private int codigoPro;
    private String nombrePro;
    private String categoriaPro;
    private float precioPro;
    private int cantidadStock;
    
    //Metodos set y get de las variables
    public int getCodigoPro() {
        return codigoPro;
    }

    public void setCodigoPro(int codigoPro) {
        this.codigoPro = codigoPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getCategoriaPro() {
        return categoriaPro;
    }

    public void setCategoriaPro(String categoriaPro) {
        this.categoriaPro = categoriaPro;
    }

    public float getPrecioPro() {
        return precioPro;
    }

    public void setPrecioPro(float precioPro) {
        this.precioPro = precioPro;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
}
