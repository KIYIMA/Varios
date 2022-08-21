
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
    
    /**Constructor persona: inicializa los atributos (int p_nroDni, String p_nombre, String p_apellido, int p_anioNacimiento)*/
     Persona(int p_nroDni, String p_nombre, String p_apellido, int p_anioNacimiento)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setDNI(p_nroDni);
        this.setAnioNacimiento(p_anioNacimiento);
    }
    /**Constructor persona: inicializa los atributos (int p_nroDni, String p_nombre, String p_apellido, Calendar p_anioNacimiento)*/
    Persona(int p_nroDni, String p_nombre, String p_apellido, Calendar p_anioNacimiento)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setDNI(p_nroDni);
        this.setFechaNacimiento(p_anioNacimiento);
    }
    
    
    /**Metodo Setter para atributo "nroDni", carga el atributo con el dato de tipo int que recibe como parametro, devuelve void*/    
    private void setDNI(int p_nroDni)
    {
        this.nroDni= p_nroDni;
    }
    /**Metodo Setter para atributo "nombre", carga el atributo con el dato de tipo String que recibe como parametro, devuelve void*/    
    private void setNombre(String p_nombre)
    {
        this.nombre= p_nombre;
    }
    /**Metodo Setter para atributo "apellido", carga el atributo con el dato de tipo String que recibe como parametro, devuelve void*/    
    private void setApellido(String p_apellido)
    {
        this.apellido= p_apellido;
    }
    /**Metodo Setter para atributo "fechaNacimiento", genera una dato de tipo Calendar colocando el dato recibido como parametro en el espacio asignado al año y asi pasar ese nuevo dato de tipo Calendar al metodo setFechaNacimient(), devuelve void, metodo de acceso privado*/    
    private void setAnioNacimiento(int p_anioNacimiento)
    {
        Calendar fechNaci = new GregorianCalendar();
        fechNaci.set(p_anioNacimiento, Calendar.MONTH, Calendar.DATE);
        this.setFechaNacimiento(fechNaci);
    }
    /**Metodo Setter para atributo "fechaNacimiento", carga el atributo con el dato de tipo Calendar que recibe como parametro, devuelve void*/    
    private void setFechaNacimiento(Calendar p_fechaNacimiento){
        this.fechaNacimiento = p_fechaNacimiento;
    }
    
    
    /**Metodo Getter para atributo "nroDni", devuelve un dato de tipo int de dicho atributo, no recibe parametros*/
    public int getDNI()
    {
        return this.nroDni;
    }
    /**Metodo Getter para atributo "nombre", devuelve un dato de tipo String de dicho atributo, no recibe parametros*/
    public String getNombre()
    {
        return this.nombre;
    }
    /**Metodo Getter para atributo "apellido", devuelve un dato de tipo String de dicho atributo, no recibe parametros*/
    public String getApellido()
    {
        return this.apellido;
    }
    /**Metodo Getter para atributo "fechaNacimiento", devuelve un dato de tipo int correspondiente al año de dicho atributo, no recibe parametros*/
    public int getAnioNacimiento()
    {
        return this.getFechaNacimiento().get(Calendar.YEAR);
    } 
    /**Metodo Getter para atributo "fechaNacimiento", devuelve un objeto de tipo Calendar de dicho atributo, no recibe parametros*/
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    
    /**Retorna la edad (dato de tipo int) de la persona, no recibe parametros, metodo de acceso publico*/
    public int edad(){
        Calendar anioAhora= new GregorianCalendar();
        int anioActual= anioAhora.get(Calendar.YEAR);
        return (anioActual - this.getAnioNacimiento());
    }
    /**Retorna una cadena (String) con el formato "nombre apellido", no recibe parametros, metodo de acceso publico*/
    public String nomYApe(){
        return (this.getNombre() + " " + this.getApellido());
    }
    /**Retorna una cadena (String) con el formato "apellido nombre", no recibe parametros, metodo de acceso publico*/
    public String apeYNom(){
        return ( this.getApellido() + " " + this.getNombre());
    }
    /**Muestra datos detallados del objeto de tipo Persona, no recibe parametros, retorna void, metodo de acceso publico*/
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYApe() + "\nDNI: " + this.getDNI() + "\tEdad: "+this.edad() + " años");
    }
}
