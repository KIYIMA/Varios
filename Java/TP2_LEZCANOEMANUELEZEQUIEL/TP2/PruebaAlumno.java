
/**
 * Write a description of class PruebaAlumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaAlumno
{
    public static void main(String []args){
        Alumno nuevoAlumno= new Alumno(Integer.valueOf(args[0]), String.valueOf(args[1]), String.valueOf(args[2]));
        nuevoAlumno.setNota1(Double.valueOf(args[3]));
        nuevoAlumno.setNota2(Double.valueOf(args[4]));
        nuevoAlumno.mostrar();
        //System.out.print("\n "+ );
    }
}
