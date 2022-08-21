
/**
 * Write a description of class Emapleado here.
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
    private int anioIngreso;
    /**Constructor Empleado: inicializa los atributos (long cuil, String apellido, String nombre, double importe, int anio)*/
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.seetAnioIngreso(p_anio);
    }
    /**Constructor Empleado: inicializa a 0 el constructor*/
    public Empleado()
    {
        
    }
    
    
    /**Metodo Setter para atributo "cuil", carga el atributo con el objeto de tipo long que recibe como parametro, devuelve void*/
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    /**Metodo Setter para atributo "apellido", carga el atributo con el objeto de tipo String que recibe como parametro, devuelve void*/
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    /**Metodo Setter para atributo "nombre", carga el atributo con el objeto de tipo String que recibe como parametro, devuelve void*/
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**Metodo Setter para atributo "sueldoBasico", carga el atributo con el objeto de tipo double que recibe como parametro, devuelve void*/
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    /**Metodo Setter para atributo "anioIngreso", carga el atributo con el objeto de tipo int que recibe como parametro, devuelve void*/
    private void seetAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    
    /**Metodo Getter para atributo "cuil", devuelve un objeto de tipo long de dicho atributo, no recibe parametros*/
    public long getCuil(){
        return this.cuil;
    }
    /**Metodo Getter para atributo "apellido", devuelve un objeto de tipo String de dicho atributo, no recibe parametros*/
    public String getApellido(){
        return this.apellido;
    }
    /**Metodo Getter para atributo "nombre", devuelve un objeto de tipo String de dicho atributo, no recibe parametros*/
    public String getNombre(){
        return this.nombre;
    }
    /**Metodo Getter para atributo "sueldoBasico", devuelve un objeto de tipo double de dicho atributo, no recibe parametros*/
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    /**Metodo Getter para atributo "anioIngreso", devuelve un objeto de tipo int de dicho atributo, no recibe parametros*/
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    
    
    /**Devuelve el valor (int) correspondiente a los años que tiene trabajando el empleado desde que ingreso hasta la actualidad, no recibe parametros, es un metodo de acceso publico*/
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return (anioHoy - this.getAnioIngreso());
    }
    /**Devuelve el valor (double) de la suma correspondiente a el descuento por obra social y por seguro de vida, no recibe parametros, metodo de acceso privado*/
    private double descuento(){
        return ((this.getSueldoBasico() * 0.02)+(this.getSueldoBasico() * 0.12)); 
    }
    /**Devuelve el valor (double) adicional que le corresponde al empleado dependiendo de su antiguedad (<2 años-2%, >2y<10 años-4%, >=10 años-6%), no recibe parametros, metodo de acceso privado*/
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
    /**Retorna un valor te tipo double que corresponde al sueldo neto del empleado, no recibe parametros, metodo de acceso publico*/
    public double sueldoNeto(){
        return ((sueldoBasico + adicional())- descuento());
    }
    /**Retorna una cadena (String) con el formato "nombre apellido", no recibe parametros, metodo de acceso publico*/
    public String nomYApe(){
        return (nombre + ", " + apellido);
    }
    /**Retorna una cadena (String) con el formato "apellido nombre", no recibe parametros, metodo de acceso publico*/
    public String apeYNom(){
        return (apellido + ", " + nombre);
    }
    /**Imprime detalladamente los datos del empleado, retorna void, no recibe parametros, metodo de acceso publico*/
    public void mostrar(){
        System.out.print("Nombre y Apellido: "+nombre+ " " +apellido+ "\nCUIL: " + cuil + "\tAntiguedad: " +antiguedad()+ " años de servicio \nSueldo Neto: $ " +sueldoNeto());
    }
    /**Devuelve una cadena de caracteres (String) con el nombre, apellido y el sueldo neto del empleado, no recibe parametros, metodo de acceso publico*/
    public String mostrarLinea(){
        return (cuil + "\t" + nombre + "," + apellido + ".........." + sueldoNeto());
    }
}