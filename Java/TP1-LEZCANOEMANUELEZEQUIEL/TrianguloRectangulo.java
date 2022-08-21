
/**
 * Write a description of class TrianguloRectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TrianguloRectangulo
{   
   public static void main(String []args){
       double hipotenusa= Double.parseDouble(args[0]);
        double catet1= Double.parseDouble(args[1]);
        double catet2= Double.parseDouble(args[2]);
       if((Math.pow(hipotenusa, 2)) == ((Math.pow(catet1, 2))+(Math.pow(catet2, 2)))) {
           System.out.println("TRIANGULO RECTANGULO !!");
       }
   }
}
