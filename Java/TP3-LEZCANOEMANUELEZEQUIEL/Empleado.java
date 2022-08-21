
/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util. *;
public class Empleado
{
    /**Declaracion de atributos*/
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    
    /**Constructor Empleado*/
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha)
    {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public long getCuil(){
        return this.cuil;
    }
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return (anioHoy - getFechaIngreso().get(Calendar.YEAR));
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
        System.out.print("\n\tNombre y Apellido: "+getNombre()+ " " +getApellido()+ "\n\tCUIL: " + getCuil() + "\tAntiguedad: " +antiguedad()+ " años de servicio \n\tSueldo Neto: $ " +sueldoNeto());
    }
    public String mostrarLinea(){
        return (cuil + "\t" + getNombre() + "," + getApellido() + ".........." + sueldoNeto());
    }
    public boolean esAniversario(){
        Calendar fechHoy = new GregorianCalendar();
        
        if((getFechaIngreso().get(Calendar.DATE) == fechHoy.get(Calendar.DATE)) && (getFechaIngreso().get(Calendar.MONTH)) == fechHoy.get(Calendar.MONTH)){
            return true;
        }else{
            return false;
        }
    }
    public void mensajePorAniversario(){
        if(esAniversario() == true){
            System.out.print("\n\tNOTA: Le comunicamos que en el dia hoy usted puede retirarse 1 hora \n\tmas temprano por cumplir un año de servicio mas con la empresa. ");
        }else{
            System.out.print("\n\tAun no cumple aniversario en la empresa !!!");
        }
    }
}
