
/**
 * Una droguería que comercia con laboratorios
   que producen medicamentos modeló la 
   clase Laboratoriorepresentada en el 
   diagrama de clases adjunto.
   Implemente en java la clase Laboratorio...
 * 
 * @author (Lezcano Emanuel Ezequiel) 
 * @version (1.0)
 */
public class Laboratorio
{
    /**Declaracion de atributos*/
    private String nombre= "";
    private String domicilio= "";
    private String telefono= "";
    private int compraMinima= 0;
    private int diaEntrega= 0;
    /**
     * Constructor Laboratorio
       DOBLE ENCAPSULAMIENTO
    */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega)
    {
        this.nombre = p_nombre;
        this.domicilio = p_domicilio;
        this.telefono = p_telefono;
        this.compraMinima = p_compraMinima;
        this.diaEntrega = p_diaEntrega;
    }
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        this.nombre = p_nombre;
        this.domicilio = p_domicilio;
        this.telefono = p_telefono;
    }
    
    private void setNuevaCompraMinima(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    private void setNuevoDiaEntrega(int p_diaEnt)
    {
        this.diaEntrega = p_diaEnt;
    }
    
    public void nuevaCompraMinima(int p_compraMin)
    {
        this.setNuevaCompraMinima(p_compraMin);
    }
    public void nuevoDiaEntrega(int p_diaEnt)
    {
        this.setNuevoDiaEntrega(p_diaEnt);
    }
    
    public String mostrar()
    {
        String datAMostrar = "\nLaboratorio: "+ nombre + "\nDomicilio: " + domicilio + " -Telefono: " + telefono;
        return datAMostrar;
    }
}
