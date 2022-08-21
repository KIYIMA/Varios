
/**
 * Write a description of class AplicacionBanco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class AplicacionBanco
{
    public static void main(String []args){
        
        
        
        Localidad localidad1 = new Localidad("Santo Tomé","Corrientes");
        Empleado empleado1 = new Empleado(20-55555555-2,"Lopez","Juan",15000, 2006);
        Empleado empleado2 = new Empleado(20-44444444-2,"Martines","Jose",14000, 2004);
        Empleado empleado3 = new Empleado(20-66666666-2,"Nuñes","Matias",18000, 2008);
        ArrayList empleados1 = new ArrayList();
        
        Banco banco1 = new Banco("Santander", localidad1, 2, empleados1);
        banco1.getEmpleados().add(empleado1);
        banco1.mostrar();
        banco1.getEmpleados().add(empleado2);
        banco1.getEmpleados().add(empleado3);
        banco1.mostrar();
        banco1.quitarEmpleado(empleado2);
        banco1.mostrar();
        
        //EJECUTO EJERCICIO 4
        Persona persona1 = new Persona(44555666,"Mili", "Lopez", 1998);
        CuentaBancaria cuentaPersona1 = new CuentaBancaria(3333,persona1, 5500);
        
        Persona persona2 = new Persona(66222111,"Maria", "Nuñes", 1991);
        CuentaBancaria cuentaPersona2 = new CuentaBancaria(2222,persona2, 12000);
        
        Persona persona3 = new Persona(44555666,"Julia", "Martinez", 1994);
        CuentaBancaria cuentaPersona3 = new CuentaBancaria(7777,persona3, 15300);
        
        Persona persona4 = new Persona(22222212,"Elian", "Gauna", 1999);
        CuentaBancaria cuentaPersona4 = new CuentaBancaria(5555,persona4, 0);
        
        ArrayList cuentas1 = new ArrayList();
        
        Banco banco2 = new Banco("Santander", localidad1, 2, empleados1, cuentas1);
        banco2.agregarCuentaBancaria(cuentaPersona1);
        banco2.agregarCuentaBancaria(cuentaPersona2);
        banco2.agregarCuentaBancaria(cuentaPersona3);
        banco2.agregarCuentaBancaria(cuentaPersona4);
        
        banco2.mostrarResumen();
        
        banco2.quitarCuentaBancaria(cuentaPersona2);
        
        banco2.mostrarResumen();
    }
}
