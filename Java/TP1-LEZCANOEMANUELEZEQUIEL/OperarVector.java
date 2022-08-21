
/**
 * Write a description of class OperarVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class OperarVector
{
    
    public static void main(){
        int i=0;
        Scanner entrada=new Scanner(System.in);
        int [] notasAlum= new int[5];
        while(i < 5) {
            System.out.println("Posicion " + (i+1)+ ": ");
            notasAlum [i] = entrada.nextInt();
            i++;
        }
        System.out.print("Vector:  ");
        while(0<i) {
            System.out.print(" " +notasAlum [i-1]);
            i--;
        }
    }
}
