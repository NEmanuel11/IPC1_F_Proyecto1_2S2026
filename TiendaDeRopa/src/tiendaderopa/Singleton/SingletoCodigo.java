package tiendaderopa.Singleton;

/**
 *
 * @author Emanuel López
 */
public class SingletoCodigo {
    //Instancia de un unico codigo del productos que se va ir agregando.
    private static final SingletoCodigo instancia = new SingletoCodigo();
    private int codigoProducto = 1;
    
    private SingletoCodigo(){}
    
    public static  SingletoCodigo getInstancia(){
        return instancia;
    }
    
    public int generarId(){
        return codigoProducto++;
    }
    
    
}
