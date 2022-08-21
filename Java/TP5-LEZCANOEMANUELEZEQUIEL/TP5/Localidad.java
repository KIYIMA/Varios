
/**
 * Write a description of class Localidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Localidad
{
    private String nombre;
    private String provincia;
    /**Constructor Localidad: inicializa los atributos (String nombre, String provincia)*/
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    
    /**Metodo Setter para atributo "nombre", carga el atributo con el dato (String) que recibe como parametro, devuelve void*/
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**Metodo Setter para atributo "provincia", carga el atributo con el dato (String) que recibe como parametro, devuelve void*/
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    
    /**Metodo Getter para atributo "nombre", devuelve un objeto de tipo String de dicho atributo, no recibe parametros*/
    public String getNombre(){
        return this.nombre;
    }    
    /**Metodo Getter para atributo "provincia", devuelve un objeto de tipo String de dicho atributo, no recibe parametros*/
    public String getProvincia(){
        return this.provincia;
    }
    
    
    /**Retorna detalladamente una cadena de caracteres (String) mostrando el contenido de los atributos del constructor Localidad , no recibe parametros, el metodo es de acceso publico*/
    public String mostrar()
    {
        return ("\nLocalidad: "+getNombre()+ "\tProvincia: "+getProvincia());
    }
}
