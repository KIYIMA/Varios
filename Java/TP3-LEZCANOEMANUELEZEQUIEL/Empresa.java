
/**
 * Write a description of class Empresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Empresa
{
    public static void main(String []args){
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2014, 8, 10);
        
        Calendar fechaHo = Calendar.getInstance();
        fechaHo.set(Calendar.DAY_OF_MONTH, Calendar.MONTH, Calendar.DATE);
        
        Empleado empleado1 = new Empleado(14777666, "Julio", "Lopez", 15000, fecha1);
        
        empleado1.mostrar();
        empleado1.mensajePorAniversario();
        System.out.print("\n\t"+empleado1.mostrarLinea());
        
    }
}
