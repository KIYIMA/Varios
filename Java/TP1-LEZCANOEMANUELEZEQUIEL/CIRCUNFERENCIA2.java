
/**
 * Crear una clase denominada Circunferencia, que contenga el método main(), en el que se calcule el perímetro 
   de una circunferencia, ingresando el radio de tipo entero a través del argumento del main().
 * 
 * @author Lezcano Emanuel Ezequiel 
 * @version (1.1)
 */

import java.util.* ;    
public class CIRCUNFERENCIA2
{
    Scanner entrada = new Scanner(System.in);
    int radio = entrada.nextInt();
    
    public static void main(int radio){
        System.out.println("Perimetro: "+ (radio*2*(Math.PI)));
    }
}

