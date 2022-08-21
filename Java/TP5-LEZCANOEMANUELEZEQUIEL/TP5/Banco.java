
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Banco
{
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList <Empleado> empleados;
    private ArrayList <CuentaBancaria> cuentas;
    private Empleado empleado;

    /**
     * Constructor for objects of class Banco
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado)
    {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(p_empleado);
    }
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados)
    {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
    }
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados,ArrayList p_cuentas)
    {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentas(p_cuentas);
    }
    
    /**Metodo Setter para atributo "nombre", carga el atributo con el dato de tipo String que recibe como parametro, devuelve void*/
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**Metodo Setter para atributo "localidad", carga el atributo con el dato de tipo Localidad que recibe como parametro, devuelve void*/
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    /**Metodo Setter para atributo "nroSucursal", carga el atributo con el dato de tipo int que recibe como parametro, devuelve void*/
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal;
    }
    /**Metodo Setter para atributo "empleado", carga el atributo con el dato de tipo Empleado que recibe como parametro, devuelve void*/
    private void setEmpleado(Empleado p_empleado){
        this.empleado = p_empleado;
    }
    /**Metodo Setter para atributo "empleados", carga el atributo con el dato de tipo ArrayList que recibe como parametro, devuelve void*/
    private void setEmpleados(ArrayList p_empleados){
        this.empleados = p_empleados;
    }
    /**Metodo Setter para atributo "cuentas", carga el atributo con el dato de tipo ArrayList que recibe como parametro, devuelve void*/
    private void setCuentas(ArrayList p_cuentas){
        this.cuentas = p_cuentas;
    }
    
    
    /**Metodo Getter para atributo "nombre", devuelve un dato de tipo String de dicho atributo, no recibe parametros*/
    public String getNombre(){
        return this.nombre;
    }
    /**Metodo Getter para atributo "localidad", devuelve un dato de tipo Localidad de dicho atributo, no recibe parametros*/
    public Localidad getLocalidad(){
        return this.localidad;
    }
    /**Metodo Getter para atributo "nroSucursal", devuelve un dato de tipo int de dicho atributo, no recibe parametros*/
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    /**Metodo Getter para atributo "empleado", devuelve un dato de tipo Empleado de dicho atributo, no recibe parametros*/
    public Empleado getEmpleado(){
        return this.empleado;
    }
    /**Metodo Getter para atributo "empleados", devuelve un dato de tipo ArrayList de dicho atributo, no recibe parametros*/
    public ArrayList getEmpleados(){
        return this.empleados;
    }
    /**Metodo Getter para atributo "cuentas", devuelve un dato de tipo ArrayList de dicho atributo, no recibe parametros*/
    private ArrayList getCuentas(){
        return this.cuentas;
    }
    
    
    /**Agrega un objeto de tipo Empleado a la coleccion, el cual recibe como parametro, retorna el resultado de la operacion (boolean), el metodo es de acceso publico*/
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    /**Elimina un objeto de tipo Empleado a la coleccion, el cual recibe como parametro, retorna el resultado de la operacion (boolean), el metodo es de acceso publico*/
    public boolean quitarEmpleado(Empleado p_empleado){
        return this.getEmpleados().remove(p_empleado);
    }
    /**Muestra los apellidos y nombres de empleados con sus sueldos, retorna void, no recibe parametros, metodo de acceso publico */
    public void listarSueldos(){
        for(Empleado e: empleados){
            System.out.print("\n"+e.apeYNom()+ "-----------------$"+e.sueldoNeto());
        }
    }
    /**Retorna el total a pagar de todos los empleados, no recibe parametros, metodo de acceso publico*/
    public double sueldoAPagar(){
        double totalAPagar = 0.0;
        for(Empleado e: empleados){
            totalAPagar = totalAPagar + e.sueldoNeto();
        }
        return totalAPagar;
    }
    
    
    
    public void mostrar(){
        System.out.print("\nBanco: "+this.getNombre()+"\tSucursal: "+this.nroSucursal+"\nLocalidad: "+this.getLocalidad().getNombre()+ "\tProvincia: "+this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.print("\nTotal a Pagar-----------------------------------$"+this.sueldoAPagar()+"\n\n");
    }
    /**Agrega un objeto de tipo CuentaBancaria a la coleccion, el cual recibe como parametro, retorna void, el metodo es de acceso publico*/
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentas().add(p_cuenta);
    }
    /**Elimina un objeto de tipo CuentaBancaria de la coleccion, el cual recibe como parametro, retorna el objeto eliminado, el metodo es de acceso publico*/
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentas().remove(p_cuenta);
    }
    /**Muestra las cuentas bancarias con saldo en valor 0, retorna void, no recibe parametros, metodo de acceso publico */
    private void mostrarSaldoCero(){
        System.out.print("\n-------------------------------------------------------------------------");
        System.out.print("\nTitulares con Cuenta en saldo Cero");
        System.out.print("\n-------------------------------------------------------------------------");
        for(CuentaBancaria e: cuentas){
            if(e.getSaldo() == 0){
                System.out.print("\n"+e.getTitular().getDNI()+ "\t\t\t"+e.getTitular().apeYNom());
            }
        }
        System.out.print("\n-------------------------------------------------------------------------");
    }
    /**Retorna la cantidad (int) de cuentas que tiene la coleccion, es de acceso privado y no recibe parametros*/
    private int cantidadCuentas(){
        int contador = 0;
        for(CuentaBancaria e: cuentas){
                contador++;
        }
        return contador;
    }
    /**Retorna la cantidad (int) de las cuentas bancarias con saldo en valor 0, retorna void, no recibe parametros, metodo de acceso privado */
    private int cuentasSaldoCero(){
        int contador = 0;
        for(CuentaBancaria e: cuentas){
            if(e.getSaldo() == 0){
                contador++;
            }
        }
        return contador;
    }
    /**Retorna la cantidad (int) de las cuentas bancarias con saldo mayor que 0, retorna void, no recibe parametros, metodo de acceso privado */
    private int cuentasSaldoActivo(){
        int contador = 0;
        for(CuentaBancaria e: cuentas){
            if(e.getSaldo() > 0){
                contador++;
            }
        }
        return contador;
    }
    /**Muestra los datos del banco, un resumenes de las cuentas que maneja, por ultimo los clientes con saldo en 0, el metodo es de acceso publico, no recibe parametros y retorna void*/
    public void mostrarResumen(){
        System.out.print("\nBanco: "+this.getNombre()+"\tSucursal: "+this.nroSucursal+"\nLocalidad: "+this.getLocalidad().getNombre()+ "\tProvincia: "+this.getLocalidad().getProvincia());
        System.out.print("\n************************************************************************************");
        System.out.print("\nRESUMEN DE CUENTAS BANCARIAS");
        System.out.print("\n************************************************************************************");
        System.out.print("\nNumero total de cuentas bancarias: "+this.cantidadCuentas()+"\nCuentas activas: "+this.cuentasSaldoActivo()+"\nCuentas saldo cero: "+this.cuentasSaldoCero());
        this.mostrarSaldoCero();
    }
}
