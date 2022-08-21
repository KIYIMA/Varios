
/**
 * Write a description of class Carrera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Carrera
{
     public static void main(String []args){
         Map < Integer, Alumno> alumnos; 
         String nombre, apellido;
         Double nota1, nota2;
         int opcion, LU;
         Boolean salir= false;
         
         Scanner teclado = new Scanner(System.in);
         Alumno alumno0 = new Alumno();
         HashMap <Integer, Alumno> lista = new HashMap<Integer, Alumno>();
         
         System.out.print("\nNombre del Curso: ");
         nombre= teclado.nextLine();
         Curso curso1 = new Curso(nombre, lista);
         
         while(!salir){
             
             System.out.print("\n\n1)Inscribir a un alumno al curso.");
             System.out.print("\n2)Listar la cantidad de alumnos del curso y lista de inscriptos en este.");
             System.out.print("\n3)Añadir notas de examenes parciales de un alumno.");
             System.out.print("\n4)Dar de baja a un alumno.");
             System.out.print("\n5)Buscar un alumno.");
             System.out.print("\n6)Obtener promedio de un alumno.");
             System.out.print("\n7)Salir.");
             System.out.print("\nDigite una opcion: ");
             
             opcion = teclado.nextInt();
             
             switch(opcion){
                case 1:
                     System.out.print("\nNumero libreta universitaria del alumno:");
                     LU = teclado.nextInt();
                     System.out.print("\nNombre del alumno:");
                     nombre = teclado.next();
                     System.out.print("\nApellido del alumno:");
                     apellido = teclado.next();
                     
                     Alumno alumno1 = new Alumno(LU, nombre, apellido);
                     curso1.getAlumnos().put(alumno1.getLu(), alumno1);
                     break;
                case 2:
                     curso1.mostrarInscriptos();
                     break;
                case 3:
                     System.out.print("\nNumero libreta universitaria del alumno al que desea añadir notas:");
                     LU = teclado.nextInt();
                     curso1.agregarNota(LU);
                     break;
                case 4:
                     System.out.print("\nIngrese nro de LU del alumno a dar de baja: ");
                     LU = teclado.nextInt();
                     Alumno vt_alumno = curso1.buscarAlumno(LU);
                     curso1.quitarAlumno(LU);
                     System.out.print("\nEsta "+vt_alumno.nomYApe()+ " inscripto?? --> "+ curso1.estaInscripto(LU));
                    break;
                case 5:
                     System.out.print("\nIngrese nro de LU del alumno a buscar: ");
                     LU = teclado.nextInt();
                     curso1.mostrarInscripto(LU);
                     break;
                case 6:
                     System.out.print("\nIngrese nro de libreta universitaria del alumno a obtener promedio: ");
                     LU = teclado.nextInt();
                     if(curso1.getAlumnos().containsKey(LU)){
                         curso1.imprimirPromedioDelAlumno(LU);
                     }else{
                         System.out.print("\nEl alumno no se encuentra registrado !!!");
                     }
                     break;
                case 7:
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
