
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util. *;
public class Persona
{
    /**Declaracion de atributos*/
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    
    /**Constructor persona*/
     Persona(int p_nroDni, String p_nombre, String p_apellido, int p_anioNacimiento)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setDNI(p_nroDni);
        this.setAnioNacimiento(p_anioNacimiento);
    }    
    Persona(int p_nroDni, String p_nombre, String p_apellido, Calendar p_anioNacimiento)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setDNI(p_nroDni);
        this.setFechaNacimiento(p_anioNacimiento);
    }
    
    private void setDNI(int p_nroDni)
    {
        this.nroDni= p_nroDni;
    }
    private void setNombre(String p_nombre)
    {
        this.nombre= p_nombre;
    }
    private void setApellido(String p_apellido)
    {
        this.apellido= p_apellido;
    }
    private void setAnioNacimiento(int p_anioNacimiento)
    {
        Calendar fechNaci = new GregorianCalendar();
        fechNaci.set(p_anioNacimiento, Calendar.MONTH, Calendar.DATE);
        this.setFechaNacimiento(fechNaci);
    }
    private void setFechaNacimiento(Calendar p_fechaNacimiento){
        this.fechaNacimiento = p_fechaNacimiento;
    }
    
    public int getDNI()
    {
        return nroDni;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
    public int getAnioNacimiento()
    {
        return getFechaNacimiento().get(Calendar.YEAR);
    } 
    public Calendar getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public int edad(){
        Calendar anioAhora= new GregorianCalendar();
        int anioActual= anioAhora.get(Calendar.YEAR);
        return (anioActual - getAnioNacimiento());
    }
    public String nomYApe(){
        return (getNombre() + " " + getApellido());
    }
    public String apeYNom(){
        return ( getApellido() + " " + getNombre());
    }
    public void mostrar(){
        String nomYape = nombre + " " + apellido;
        int Dni = nroDni;
        Calendar anioHoy= new GregorianCalendar();
        int anioActu= anioHoy.get(Calendar.YEAR);
        int anios= (anioActu - getAnioNacimiento());
        System.out.println("Nombre y Apellido: " + nomYApe() + "\nDNI: " + getDNI() + "\tEdad: "+edad() + " años");
    }
}
