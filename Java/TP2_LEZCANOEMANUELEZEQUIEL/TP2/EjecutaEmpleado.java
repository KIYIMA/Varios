
/**
 * Write a description of class EjecutaEmpleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util. *;
public class EjecutaEmpleado
{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero de CUIL: ");
        long cuil= entrada.nextLong();
        entrada.nextLine();
        System.out.print("Nombre: ");
        String nombre= entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido= entrada.nextLine();
        System.out.print("Sueldo: ");
        double sueldo= entrada.nextDouble();
        System.out.print("Año de ingreso: ");
        int anio= entrada.nextInt();
        
        Empleado nuevoEmpleado = new Empleado(cuil,apellido,nombre,sueldo,anio);
        nuevoEmpleado.mostrar(); 
        System.out.print("\n"+nuevoEmpleado.mostrarLinea());
    }
}
