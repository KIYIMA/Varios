
/**
 * Write a description of class GestionComercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class GestionComercio
{
     
     Map < Integer, Empleado> empleados; 
     public static void main(String []args){
         String aux_nombre, aux_apellido;
         Double aux_sueldo;
         int opcion, aux_anio, aux_cuil;
         Boolean salir= false;
         
         Scanner teclado = new Scanner(System.in);
         Empleado empleado0 = new Empleado();
         HashMap <Integer, Empleado> lista = new HashMap<Integer, Empleado>();
         
         System.out.print("\nNombre de la Empresa: ");
         aux_nombre= teclado.nextLine();
         Comercio comercio1 = new Comercio(aux_nombre, lista);
         
         while(!salir){
             
             System.out.print("\n\n1)Alta a un empleado.");
             System.out.print("\n2)Nomina de empleados.");
             System.out.print("\n3)Dar de baja a un empleado.");
             System.out.print("\n4)Buscar un empleado.");
             System.out.print("\n5)Obtener sueldo neto de un empleado.");
             System.out.print("\n6)Consultar si un empleado es parte de la empresa.");
             System.out.print("\n7)Conoser el numero de empleados que hay en la empresa.");
             System.out.print("\n8)Salir.");
             System.out.print("\nDigite una opcion: ");
             
             opcion = teclado.nextInt();
             
             switch(opcion){
                case 1:
                     System.out.print("\nNumero de cuil del empleado:");
                     aux_cuil = teclado.nextInt();
                     System.out.print("\nApellido del empleado:");
                     aux_apellido = teclado.next();
                     System.out.print("\nNombre del empleado:");
                     aux_nombre = teclado.next();
                     System.out.print("\nSueldo del empleado:");
                     aux_sueldo = teclado.nextDouble();
                     System.out.print("\nAño de ingreso del empleado:");
                     aux_anio = teclado.nextInt();
                     
                     Empleado empleado1 = new Empleado(aux_cuil, aux_apellido, aux_nombre, aux_sueldo, aux_anio);
                     comercio1.getEmpleados().put(empleado1.getCuil(), empleado1);
                     break;
                case 2:
                     comercio1.nomina();
                     break;
                case 3:
                     System.out.print("\nIngrese nro de CUIL del empleado a dar de baja: ");
                     aux_cuil = teclado.nextInt();
                     comercio1.bajaEmpleado(aux_cuil);
                     System.out.print("\n**** Dado de baja exitosamente !!! ****");
                     break;
                case 4:
                     System.out.print("\nIngrese nro de CUIL del empleado a buscar: ");
                     aux_cuil = teclado.nextInt();
                     if(comercio1.esEmpleado(aux_cuil)){
                         System.out.print("\nApellido y nombre del empleado: "+comercio1.buscarEmpleado(aux_cuil).apeYNom());
                     }else{
                         System.out.print("\n   ERROR!!! \nNota: no se encuentra al empleado con dicho cuil. ");
                     }
                    break;
                case 5:
                     System.out.print("\nIngrese CUIL del empleado a consultar su sueldo neto: ");
                     aux_cuil = teclado.nextInt();
                     comercio1.sueldoNeto(aux_cuil);
                     break;
                case 6:
                     System.out.print("\nIngrese CUIL del empleado a consultar si pertenece a la empresa:: ");
                     aux_cuil = teclado.nextInt();
                     if(comercio1.esEmpleado(aux_cuil)){
                         System.out.print("\n**** El empleado pertenece a la empresa!!! *****");
                     }else{
                         System.out.print("\n**** El empleado NO pertenece a la empresa!!! **** ");
                     }
                     break;
                case 7:
                     System.out.print("\nCantidad de empleados que hay en la empresa: "+comercio1.cantidadDeEmpleados());
                    break;
                case 8:
                     salir = true;
                     System.out.print("\n\n********* GOOD BYE **********\n\n");
                     break;
                default:
                     System.out.print("\nLa opcion ingresada no existe !!!");
                     break;
             }
         }
         
     }
}

