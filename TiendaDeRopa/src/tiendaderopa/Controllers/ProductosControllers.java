
package tiendaderopa.Controllers;

import tiendaderopa.Models.ProductosModels;

/**
 *
 * @author Emanuel López
 */
public class ProductosControllers {
    public static ProductosModels[] datosProductos = new ProductosModels[100];
    
    public void AgregarProductos(int codigoPro, String nombrePro, String categoriaPro, float precioPro, int cantidadStock){
        //Añadiendo los datos al arreglo:
        for(int i = 0; i<datosProductos.length; i++){
            if (datosProductos[i] == null) {
                ProductosModels productosModels = new ProductosModels();
                productosModels.setCodigoPro(codigoPro);
                productosModels.setNombrePro(nombrePro);
                productosModels.setCategoriaPro(categoriaPro);
                productosModels.setPrecioPro(precioPro);
                productosModels.setCantidadStock(cantidadStock);
                datosProductos[i] = productosModels;
                System.out.println("Se agrego Exitosamente!");
                
                return;
            }
        }
    }
    //Ver los medicamentos:
    public void verProductos(){
        //Ver los medicamentos.
        for(ProductosModels proModels: datosProductos){
           if (proModels != null){
           System.out.println("---------------------------------");
           System.out.println(proModels.getCodigoPro());
           System.out.println(proModels.getNombrePro());
           System.out.println(proModels.getCategoriaPro());
           System.out.println(proModels.getPrecioPro());
           System.out.println(proModels.getCantidadStock());
           System.out.println("---------------------------------");
           }
        }
    }
}
