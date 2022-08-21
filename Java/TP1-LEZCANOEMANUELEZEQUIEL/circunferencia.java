
/**
 * Crear una clase denominada Circunferencia, que contenga el método main(), en el que se calcule el perímetro 
   de una circunferencia, ingresando el radio de tipo entero a través del argumento del main().
 * 
 * @author Lezcano Emanuel Ezequiel 
 * @version (1.0)
 */
public class circunferencia
{
    
    public static void main(String [] args){
        int radio= Integer.valueOf(args[0]);
        System.out.println("Perimetro: "+ (radio*2*(Math.PI)));
    }
}
