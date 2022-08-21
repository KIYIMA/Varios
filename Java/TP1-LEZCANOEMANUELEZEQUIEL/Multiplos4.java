
/**
 * Crear una clase que contenga el método main(), en el que se determinen y muestren por pantalla los números 
   múltiplos de 4 a partir de 42 y hasta el 150 inclusive. Usar la sentencia de bucle más apropiada.
 * 
* @author Lezcano Emanuel Ezequiel 
 * @version (1.0)
 */
public class Multiplos4
{
    public static void main(String [] args){
        int x = 11;
        System.out.println("MULTIPLOS DE 4: ");
        while(((x*4) >= 42) && ((x*4)<= 150)) {
            System.out.print(" " + (x*4) );
            x++;
        }
    }
}
