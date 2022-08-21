
/**
 * Write a description of class ArrayDePuntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class ArrayDePuntos
{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        Punto puntos [] = new Punto[6];
        
        //Carga un array de tipo Punto, pidiendole al usuario que ingrese por teclado las coordenadas
        for(int i=0; i< puntos.length; i++){
            System.out.print("Ingrese coordenada: \n");
            puntos[i] = new Punto(entrada.nextDouble(), entrada.nextDouble());
        }
        
        //Muestra el contenido del array, que corresponde a las coordenadas de cada punto
        for(Punto e: puntos){
            System.out.print("\n"+e.coordenadas());
        }
        
        //Imprime la distancia que existe entre puntos, de la siguiente manera: punto1-punto2, punto2-punto3,..., etc.
        for(int i=0; i< puntos.length; i++){
            System.out.print("\nDistancia punto"+(i+1)+"-punto"+(i+2)+" : "+puntos[i].distancia(puntos[i+1]));
        }
        
    }   
    
}