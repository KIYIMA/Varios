
/**
 * Write a description of class Laboratorio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laboratorio
{
    //Declaracion de atributos
    private String nombre= "";
    private String domicilio= "";
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    /** Constructor Laboratorio inicializador de atributos (String nombre, String domicilio, String telefono, int compraMinima, int diaEntrega)*/
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }
    /** Constructor Laboratorio inicializador de atributos (String nombre, String domicilio, String telefono)*/
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }
    
    /**Metodo Setter para atributo "nombre", carga el atributo con el dato (String) que recibe como parametro, devuelve void*/
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**Metodo Setter para atributo "domicilio", carga el atributo con el dato (String) que recibe como parametro, devuelve void*/
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    /**Metodo Setter para atributo "telefono", carga el atributo con el dato (String) que recibe como parametro, devuelve void*/
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    /**Metodo Setter para atributo "compraMinima", carga el atributo con el dato (int) que recibe como parametro, devuelve void*/
    private void setCompraMinima(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    /**Metodo Setter para atributo "diaEntrega", carga el atributo con el dato (int) que recibe como parametro, devuelve void*/
    private void setDiaEntrega(int p_diaEnt)
    {
        this.diaEntrega = p_diaEnt;
    }
    
    /**Metodo Getter para atributo "nombre", devuelve el valor (String) de dicho atributo, no requiere argumentos*/
    public String getNombre(){
        return this.nombre;
    }
    /**Metodo Getter para atributo "domicilio", devuelve el valor (String) de dicho atributo, no requiere argumentos*/
    public String getDomicilio(){
        return this.domicilio;
    }
    /**Metodo Getter para atributo "telefono", devuelve el valor (String) de dicho atributo, no requiere argumentos*/
    public String getTelefono(){
        return this.telefono;
    }
    /**Metodo Getter para atributo "compraMinima", devuelve el valor (int) de dicho atributo, no requiere argumentos*/
    public int getCompraMinima(){
        return this.compraMinima;
    }
    /**Metodo Getter para atributo "diaEntrega", devuelve el valor (int) de dicho atributo, no requiere argumentos*/
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
    /**Metodo de acceso publico, requiere un dato de tipo "int" como argumento, devuelve void. Carga el atributo compraMinima con el dato pasado como argumento*/
    public void nuevaCompraMinima(int p_compraMin)
    {
        this.setCompraMinima(p_compraMin);
    }
    /**Metodo de acceso publico, requiere un dato de tipo "int" como argumento, devuelve void. Carga el atributo diaEntrega con el dato pasado como argumento*/
    public void nuevoDiaEntrega(int p_diaEnt)
    {
        this.setDiaEntrega(p_diaEnt);
    }
    /**Metodo de acceso publico, no requiere argumentos, retorna un dato de tipo "String" que corresponde a los atributos del constructor Laboratorio nombre, domicilio y telefono*/
    public String mostrarDatos()
    {
        return ("\nLaboratorio: "+ this.getNombre() + "\nDomicilio: " + this.getDomicilio() + " -Telefono: " + this.getTelefono());
    }
}
