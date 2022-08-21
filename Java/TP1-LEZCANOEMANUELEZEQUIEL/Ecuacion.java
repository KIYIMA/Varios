
/**
 *  Crear una clase denominada Ecuacion que contenga el método main() y que calcule las raíces reales de una 
    ecuación de segundo grado. Los valores de los coeficientes a, b y c se ingresarán por teclado como 
    argumentos del método main(). Considerar que si discriminante > 0 se deben calcular las 2 raíces, si 
    discriminante = 0 se debe calcular una sola raíz, especificando por pantalla que x1 = x2. En caso de ser 
    negativo, mostrar un mensaje indicando que se encuentra frente a una solución compleja (numero 
    imaginario).
 * 
 * @author Lezcano Emanuel Ezequiel 
 * @version (1.0)
 */
import java.util.*;
public class Ecuacion
{
    public static void main(String []args){
        double a= Double.parseDouble(args[0]);
        double b= Double.parseDouble(args[1]);
        double c= Double.parseDouble(args[2]);
        
        if(((Math.pow(b, 2))-(4*a*c)) < 0) {
            System.out.println("Complex solution !!");   
        }else {
            if(((Math.pow(b, 2))-(4*a*c)) == 0) {
                System.out.println("X1 y X2 son igual a: "+ ((-b +(Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/ (2*a)));
            }else {
                System.out.println("X1: "+ ((-b +(Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/ (2*a)) + "\nX2: " +((-b -(Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/ (2*a)));
            }
        }
        
    }
}
