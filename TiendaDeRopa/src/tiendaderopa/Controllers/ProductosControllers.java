
package tiendaderopa.Controllers;

import javax.swing.table.DefaultTableModel;
import tiendaderopa.Models.ProductosModels;

/**
 *
 * @author Emanuel López
 */
public class ProductosControllers {
    public static ProductosModels[] datosProductos = new ProductosModels[100];
    //Meto para Agrgar Productos
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
    //Metodo para buscar los productos Mediantes un el Codigo
    public ProductosModels BuscarProductosID(int codigoPro){
        for(ProductosModels proModels : datosProductos){
        if(proModels != null && proModels.getCodigoPro() == codigoPro){
            return proModels;
        }
    }
    return null;
    }
    
    //Metodo para buscar productos mediantes el Nombre
    public void BuscarProductosNombre(String nombrePro, DefaultTableModel modelo){
        for(ProductosModels productosModels: datosProductos){
            if(productosModels != null && productosModels.getNombrePro().toLowerCase().contains(nombrePro.toLowerCase())){    
                modelo.addRow(new Object[]{
                    productosModels.getCodigoPro(),
                    productosModels.getNombrePro(),
                    productosModels.getCategoriaPro(),
                    productosModels.getCantidadStock(),
                    productosModels.getPrecioPro()
                });
            }
        }
    } 
    //Metodo para buscar Productos Mediante la Categoria
    public void BuscarProductosCate(String CategoriaPro, DefaultTableModel model){
        for(ProductosModels productosModels: datosProductos){
            if(productosModels != null && productosModels.getCategoriaPro().toLowerCase().contains(CategoriaPro.toLowerCase())){
                model.addRow(new Object[]{
                    productosModels.getCodigoPro(),
                    productosModels.getNombrePro(),
                    productosModels.getCategoriaPro(),
                    productosModels.getCantidadStock(),
                    productosModels.getPrecioPro()
                });
            }
        }
    }
    //Metodo para eliminar Productos.
    
    
    
    //Ver los productos:
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
