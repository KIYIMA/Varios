
/**
 * Crear una clase denominada OrdenVector, que permita ingresar por teclado 
   (Scanner) 4 elementos dobles, y almacenarlos en un array. Determinar el 
   menor elemento y mostrarlo. Ordenar los elementos del vector de menor a 
   mayor. Mostrar los elementos ordenados, separados por un tabulador. Usar 
   sentencia FOR para el ingreso de datos. Utilizar método de la Burbuja
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class OrdenVector
{
    public static void main(String [] args){
        Scanner entrada=new Scanner(System.in);
        int i, j;
        double mayor=0, menor=0, aux;
        
        double [] notasAlum= new double[4];
        
        for(i=0; i< notasAlum.length;i++) {
            System.out.println("Posicion " + (i+1)+ ": ");
            notasAlum [i] = entrada.nextDouble();
        }
        
        System.out.print("Vector: ");
        for(i=0; i< notasAlum.length;i++) {
            System.out.print(" " + notasAlum [i]);
        }
        
        mayor = menor = notasAlum[0];
        for(i=0; i< (notasAlum.length - 1);i++) {
            
            if (notasAlum[i+1] > mayor) {
                mayor= notasAlum[i+1];
            }
            if (notasAlum[i+1] < menor) {
                menor= notasAlum[i+1];
            }
        }
        
        System.out.println("\nEl menor es: "+ menor);
        for(i=0; i< (notasAlum.length-1); i++) {
            for(j=0; j < (notasAlum.length-1); j++) {
                if(notasAlum[j]> notasAlum [j+1]) {
                    aux=notasAlum[j];
                    notasAlum[j]= notasAlum[j+1];
                    notasAlum[j+1]= aux;
                }
            }
        }
        System.out.print("Vector ordenado crecientemente: ");
        for(i=0; i< notasAlum.length;i++) {
            System.out.print(" " + notasAlum [i]);
        }
    }
}









