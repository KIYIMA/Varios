
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
    
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getProvincia(){
        return provincia;
    }
    public String mostrar()
    {
        return ("\nLocalidad: "+getNombre()+ "\tProvincia: "+getProvincia());
    }
}
