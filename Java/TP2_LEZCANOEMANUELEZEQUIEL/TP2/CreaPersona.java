
/**
 * Write a description of class Pruebaper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreaPersona{
    public static void main(String [] args){
        Persona unaPersona = new Persona(435555, "Juan", "Lopez", 1999);
        unaPersona.mostrar();
        System.out.print("DNI: "+ unaPersona.getDNI()+ "\nNombre: "+ unaPersona.getNombre() +"\nApellido: "+ unaPersona.getApellido()+ "\nAño de nacimiento: "+ unaPersona.getAnioNacimiento());
        System.out.print("\n\nNombre y apellido: " +unaPersona.nomYApe());
        System.out.print("\n\nApellido y nombre: " +unaPersona.apeYNom());
        System.out.print("\n\nEdad: " +unaPersona.edad());
    }
}

