
/**
 * Write a description of class Comercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Comercio
{
    // instance variables 
    private String nombre;
    private HashMap <Integer, Empleado>  empleados;

    /**Constructor Pedido: inicializador de atributo (String nombre)*/    
    public Comercio(String p_nombre)
    {
        this.setNombre(p_nombre);
    }
    /**Constructor Pedido: inicializador de atributos (String nombre, HashMap empleados)*/
    public Comercio(String p_nombre, HashMap p_empleados)
    {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    
    /**Metodo Setter para atributo "nombre", carga el atributo con el dato (String) que recibe como parametro, devuelve void*/
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**Metodo Setter para atributo "empleados", carga el atributo con el dato (Empleado) que recibe como parametro, devuelve void*/
    private void setEmpleados(HashMap p_empleados){
        this.empleados = p_empleados;
    }
    
    
    /**Metodo Getter para atributo "nombre", devuelve un objeto de tipo String de dicho atributo, no recibe parametros*/
    public String getNombre(){
        return this.nombre;
    }
    /**Metodo Getter para atributo "empleado", devuelve un objeto de tipo HashMap de dicho atributo, no recibe parametros*/
    public HashMap getEmpleados(){
        return this.empleados;
    }
    
    
    /**Agrega un objeto de tipo Empleado el cual recibe como parametro, retorna void, el metodo es de acceso publico*/
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }
    /**Elimina un objeto de tipo Empleado el cual recibe como parametro, retorna el objeto eliminado, el metodo es de acceso  publico*/
    public Empleado bajaEmpleado(long p_cuil){
        if(esEmpleado(p_cuil)){
            System.out.print("\n****__Se da de baja a "+ empleados.get(p_cuil).getNombre()+ " __****");
            return this.empleados.remove(p_cuil);
        }else{
            System.out.print("\nEl empleado con numero de cuil "+ p_cuil + " no se encuentra !!!");
            return this.empleados.remove(p_cuil);
        }
    }
    /**Retorna la cantidad (int) de empleados que tiene la coleccion, es de acceso publico y no recibe parametros*/
    public int cantidadDeEmpleados(){
        return this.getEmpleados().size();
    }
    /**Verifica que el elemento con dicha clave (int) recibida como parametro se encuentre en la coleccion, devuelve el valor (boolean) de la operacion, metodo de acceso publico*/
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    /**Busca en la coleccion el elemento con dicha clave (valor de tipo int) recibida como parametro, y devuelve dicho elemento(tipo Empleado), el metodo es de accaso publico*/
    public Empleado buscarEmpleado(long p_cuil){
        return this.empleados.get(p_cuil);
    }
    /**Imprime el sueldo neto del empleado con el cuil(dato de tipo long) recibido como parametro, retorna void, es un metodo de acceso publico*/
    public void sueldoNeto(long p_cuil){
        if(esEmpleado(p_cuil)){
            System.out.print("\n****__ El sueldo neto del empleado "+ empleados.get(p_cuil).apeYNom() + " es de: $" +empleados.get(p_cuil).sueldoNeto());
        }else{
            System.out.print("\nEl empleado con numero de cuil "+ p_cuil + " no se encuentra !!!");
        }
    }
    /**Muestra una nomina con todos los empleados dados de alta, retorna void, el metodo es de acceso publico*/
    public void nomina(){
        System.out.print("\n**** Nomina de empleados de "+ this.getNombre() + " ****");
        for(Map.Entry<Integer, Empleado> e: empleados.entrySet()){
            System.out.print("\n"+e.getKey()+" "+e.getValue().apeYNom()+ "-------------$"+e.getValue().sueldoNeto());
        }
    }
}
