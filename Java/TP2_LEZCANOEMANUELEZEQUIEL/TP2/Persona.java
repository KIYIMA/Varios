
/**
 *  El diagrama de clase adjunto representa una abstracción del 
    concepto “persona”. 
    Implemente en java la clase Persona. El método edad()
    devuelve la cantidad de años cumplidos a la fecha, 
    considerando para el cálculo sólo la diferencia entre años. La 
    salida impresa del método mostrar() debe ser la siguiente.
 * 
 * @author (Lezcano Emanuel Ezequiel) 
 * @version (1.0)
 */

import java.util. *;
public class Persona
{
    /**Declaracion de atributos*/
    private int nroDni=0;
    private String nombre="";
    private String apellido="";
    private int anioNacimiento=0;
    
    /**Constructor persona*/
     Persona(int p_nroDni, String p_nombre, String p_apellido, int p_anioNacimiento)
    {
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.nroDni = p_nroDni;
        this.anioNacimiento = p_anioNacimiento;
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
        this.anioNacimiento= p_anioNacimiento;
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
        return anioNacimiento;
    }
    
    public int edad(){
        Calendar anioAhora= new GregorianCalendar();
        int anioActual= anioAhora.get(Calendar.YEAR);
        return (anioActual - anioNacimiento);
    }
    public String nomYApe(){
        return (nombre + " " + apellido);
    }
    public String apeYNom(){
        return ( apellido + " " + nombre);
    }
    public void mostrar(){
        String nomYape = nombre + " " + apellido;
        int Dni = nroDni;
        Calendar anioHoy= new GregorianCalendar();
        int anioActu= anioHoy.get(Calendar.YEAR);
        int anios= (anioActu - anioNacimiento);
        System.out.println("Nombre y Apellido: " + nomYape + "\nDNI: " + Dni + "\tEdad: "+anios + " años");
    }
}


