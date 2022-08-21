
/**
 * Una empresa desea administrar 
   automáticamente la liquidación 
   de sueldo de sus empleados. 
   Para ello se modela la 
   abstracción del concepto 
   “empleado”, teniendo en cuenta 
   las características relevantes al 
   problema, brindando el 
   comportamiento adecuado.
 * 
 * @author (Lezcano Emanuel Ezequiel) 
 * @version (1.0)
 */
import java.util. *;
public class Empleado
{
    /**Declaracion de atributos*/
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    /**Constructor Empleado*/
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        this.cuil = p_cuil;
        this.apellido = p_apellido;
        this.nombre = p_nombre;
        this.sueldoBasico = p_importe;
        this.anioIngreso = p_anio;
    }
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return (anioHoy - anioIngreso);
    }
    private double descuento(){
        return ((sueldoBasico * 0.02)+(sueldoBasico * 0.12)); 
    }
    private double adicional(){
        if(antiguedad() < 2) {
            return (sueldoBasico * 0.02);
        }else {
            if((antiguedad() >= 2) && (antiguedad() < 10)){
                return (sueldoBasico * 0.04);
            }else{
                return (sueldoBasico * 0.06);
            }
        }
    }
    public double sueldoNeto(){
        return ((sueldoBasico + adicional())- descuento());
    }
    public String nomYApe(){
        return (nombre + " " + apellido);
    }
    public String apeYNom(){
        return (apellido + " " + nombre);
    }
    public void mostrar(){
        System.out.print("Nombre y Apellido: "+nombre+ " " +apellido+ "\nCUIL: " + cuil + "\tAntiguedad: " +antiguedad()+ " años de servicio \nSueldo Neto: $ " +sueldoNeto());
    }
    public String mostrarLinea(){
        return (cuil + "\t" + nombre + "," + apellido + ".........." + sueldoNeto());
    }
}
