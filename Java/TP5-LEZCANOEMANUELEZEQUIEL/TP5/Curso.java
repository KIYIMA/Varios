
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Curso
{
    private Alumno alumno;
    private HashMap < Integer, Alumno> alumnos; 
    private String nombre;
    Scanner teclado = new Scanner(System.in);
    /**Constructor Curso: inicializa el atributo (String nombre)*/
    public Curso(String p_nombre)
    {
        this.setNombre(p_nombre);
    }
    /**Constructor Curso: inicializa los atributos (String nombre, HashMap alumnos)*/
    public Curso(String p_nombre, HashMap p_alumnos)
    {
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    
    /**Metodo Setter para el atributo "nombre", al cual carga con el valor de tipo String que recibe como parametro, devuelve void**/
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**Metodo Setter para el atributo "nombre", al cual carga con el valor de tipo String que recibe como parametro, devuelve void**/
    private void setAlumnos(HashMap p_alumnos){
        this.alumnos = p_alumnos;
    }
    
    
    /**Metodo Getter para atributo "nombre", acceso publico, devuelve dato de tipo String*/
    public String getNombre(){
        return this.nombre;
    }
    /**Metodo Getter para atributo "alumnos", acceso publico, devuelve una coleccion de tipo HashMap*/
    public HashMap getAlumnos(){
        return this.alumnos;
    }
    
    
    /**Agrega un objeto de tipo Alumno a la coleccion, el cual recibe como parametro, retorna void, el metodo es de acceso publico*/
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }
    /**Elimina un objeto de tipo Alumno de la coleccion, el cual recibe como parametro, retorna el objeto eliminado, el metodo es de acceso publico*/
    public Alumno quitarAlumno(int p_lu){
        if(estaInscripto(p_lu)){
            System.out.print("\n****__Se da de baja a "+ alumnos.get(p_lu).getNombre()+ " porque abandona el curso __****");
            return this.alumnos.remove(p_lu);
        }else{
            System.out.print("\nEl alumno con libreta numero "+ p_lu + " no se encuentra en el curso !!!");
            return this.alumnos.remove(p_lu);
        }
    }
    /**Retorna la cantidad (int) de alumnos que tiene la coleccion, es de acceso publico y no recibe parametros*/
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    /**Verifica que el elemento con dicha clave (int) recibida como parametro se encuentre en la coleccion, devuelve el valor (boolean) de la operacion, metodo de acceso publico*/
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    /**Verifica que el elemento (objeto de tipo Alumno) recibido como parametro se encuentre en la coleccion, devuelve el valor (boolean) de la operacion, metodo de acceso publico*/
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsKey(p_alumno.getLu());
    }
    /**Busca en la coleccion el elemento (objeto de tipo Alumno) con dicha clave (valor de tipo int) recibida como parametro, y devuelve dicho elemento, el metodo es de accaso publico*/
    public Alumno buscarAlumno(int p_lu){
        return this.alumnos.get(p_lu);
    }
    /**Imprime el promedio del alumno asociado a la clave (dato de tipo int) que recibe como parametro, devuelve void, metodo de acceso publico*/
    public void imprimirPromedioDelAlumno(int p_lu){
        
        if(((alumnos.get(p_lu).getNota1() + alumnos.get(p_lu).getNota2()) / 2) >= 8){
            System.out.print("\n****__ Muestra el alumno con el numero de libreta "+p_lu+" __****");
            System.out.print("\nPromedio: "+(alumnos.get(p_lu).getNota1() + alumnos.get(p_lu).getNota2()) / 2);
        }else{
            System.out.print("\nEl alumno no esta inscripto !!!");
        }
        
    }
    /**Muestra la cantidad de inscriptos al curso y el nombre y apellido de dichos inscriptos, retorna void, no recibe parametros, es un metodo de acceso publico*/
    public void mostrarInscriptos(){
        System.out.print("\n****__Cantidad de inscriptos: "+this.cantidadDeAlumnos());
        for(Map.Entry<Integer, Alumno> e: alumnos.entrySet()){
            System.out.print("\n"+e.getKey()+" "+e.getValue().apeYNom());
        }
    }
    /**Muestra los datos del alumno con dicha clave (dato int) que recibe como parametro, si se encuentra y si no, emite un mensaje informando lo contrario, metodo de acceso publico, retorna void*/
    public void mostrarInscripto(int p_lu){
        System.out.print("\n****__ Busca y muestra el alumno con el numero de libreta "+p_lu+" __****");
        if(estaInscripto(p_lu)){
            alumnos.get(p_lu).mostrar();
        }else{
            System.out.print("\nEl alumno con libreta numero "+ p_lu + " no se encuentra en el curso !!!");
        }
    }
    /**Agrega notas a un alumno con dicha clave (dato int) recibida como parametro, si el alumno se encuentra y si no, emite un mensaje informando que no se encuentra el alumno, metodo de acceso publico, retorina void */
    public void agregarNota(int p_lu){
        if(estaInscripto(p_lu)){
            System.out.print("\nNota de primer parcial: ");
            alumnos.get(p_lu).setNota1(teclado.nextDouble());
            System.out.print("\nNota de segundo parcial: ");
            alumnos.get(p_lu).setNota2(teclado.nextDouble());
        }else{
            System.out.print("\nEl alumno con libreta numero "+ p_lu + " no se encuentra en el curso !!!");
        }
    }
}
