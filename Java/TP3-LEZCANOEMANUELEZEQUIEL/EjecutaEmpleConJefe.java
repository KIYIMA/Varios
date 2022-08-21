
/**
 * Write a description of class EjecutaEmpleConJefe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class EjecutaEmpleConJefe
{
    public static void main(String []args){
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2014, 8, 10);
        
        EmpleadoConJefe emple= new EmpleadoConJefe(234555,"apee", "nomm", 16000,fecha1);
        
        EmpleadoConJefe emple1= new EmpleadoConJefe(77888,"ulio", "marti", 12000, fecha1, emple);
        
        emple1.mostrar();
    }
}
