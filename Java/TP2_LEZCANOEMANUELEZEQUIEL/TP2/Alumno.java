
/**
 * It is wanted to get the average of grade points of Object Oriented Programming students. For this, the abstract concept 
   "pupil" is modeled. When an instance of Alumno is created, as grade points are not known yet, they are initialized in 
   zero.
 * 
 * @author (Lezcano Emanuel Ezequiel) 
 * @version (1.0)
 */
public class Alumno
{
    /**Declaracion de atributos*/
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1 =0.0;
    private double nota2 =0.0;
    /**Constructor Alumno*/
    public Alumno(int p_lu, String p_nombre, String p_apellido)
    {
        this.lu= p_lu;
        this.nombre= p_nombre;
        this.apellido= p_apellido;
    }
    public void setNota1(double p_nota){
        this.nota1= p_nota;
    }
    public void setNota2(double p_nota){
        this.nota2= p_nota;
    }
    private boolean aprueba(){
        if((promedio() > 7.0) && ((nota1 >= 6.0)&&(nota2 >= 6.0))) {
            return true;
        }else {
            return false;
        }
    }
    private String leyendaAprueba(){
        if(aprueba()){
            return "APROBADO";
        }else {
            return "DESAPROBADO";
        }
    }
    public double promedio(){
            return ((nota1 + nota2)/2);
    }
    public String nomYApe(){
        return (nombre + " " + apellido);
    }
    public String apeYNom(){
        return (apellido + " " + nombre);
    }
    public void mostrar(){
        System.out.print("\nNombre y apellido: " + nombre + " " + apellido + "\nLU: "+ lu + "\tNotas: "+ nota1+ " - "+ nota2 + "\nPromedio: " + promedio() + " - " + leyendaAprueba());
    }
}
