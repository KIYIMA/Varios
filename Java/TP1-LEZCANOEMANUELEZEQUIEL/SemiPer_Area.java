
/**
 * Crear una clase que contenga el método main(), declarar las variables a, b y c de tipo double, que 
   corresponden a los lados de un triángulo. Los valores deben ser ingresados por teclado como argumentos del 
   método main(). Calcular y mostrar el semiperímetro y el área del triángulo con las siguientes fórmulas: 
   semiperimetro= (a+b+c)/2 
   area= raíz cuadrada(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c))   
 * 
 * @author Lezcano Emanuel Ezequiel 
 * @version (1.0)
 */
import java.util.*;
public class SemiPer_Area
{
    
    public static void main(String [] args){
        double a= Double.parseDouble(args[0]);
        double b= Double.parseDouble(args[1]);
        double c= Double.parseDouble(args[2]);
        double semiPerimetro = (a+b+c)/2;
        System.out.println("Semiperimetro: "+ semiPerimetro);
        System.out.println("Area: "+ (Math.sqrt(semiPerimetro*(semiPerimetro-a)*(semiPerimetro-b)*(semiPerimetro-c))));
    }
}












