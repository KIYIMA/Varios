
/**
 * Write a description of class Laboratorio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
       Caonstructor sombrecargado
    */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    private void setCompraMinima(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    private void setDiaEntrega(int p_diaEnt)
    {
        this.diaEntrega = p_diaEnt;
    }
    
    public void nuevaCompraMinima(int p_compraMin)
    {
        this.setCompraMinima(p_compraMin);
    }
    public void nuevoDiaEntrega(int p_diaEnt)
    {
        this.setDiaEntrega(p_diaEnt);
    }
    
    public String mostrarDatos()
    {
        return ("\nLaboratorio: "+ nombre + "\nDomicilio: " + domicilio + " -Telefono: " + telefono);
    }
}
