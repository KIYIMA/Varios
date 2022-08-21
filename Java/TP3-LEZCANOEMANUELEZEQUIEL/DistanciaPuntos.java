
/**
 * Write a description of class DistanciaPuntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util. *;
public class DistanciaPuntos
{
    public static void main(String []args){
        Scanner entrada= new Scanner(System.in);
        Punto nuevPunto = new Punto();
        
        Punto punto1 = new Punto(5, 7);
        
        
        Punto punto2 = new Punto(2, 2);
        System.out.print("\nDistancia de un punto a otro: " + punto2.distancia(punto1));
        
    }
}  

