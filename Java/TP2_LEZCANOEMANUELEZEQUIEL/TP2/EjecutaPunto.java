
/**
 * Write a description of class EjecutaPunto here.
 * 
 * @author (Lezcano Emanuel Ezequiel) 
 * @version (1.0)
 */
import java.util. *;
public class EjecutaPunto
{
    public static void main(String []args){
        Scanner entrada= new Scanner(System.in);
        Punto nuevPunto = new Punto();
        System.out.print("\nA continuacion ingresar coordenada X seguida de la coordenada Y: \n");
        Punto nuevoPunto = new Punto(entrada.nextDouble(), entrada.nextDouble());
        nuevoPunto.mostrar();
        System.out.print("\nIngrese valor a desplazar cada coordenada(x, y).\n");
        nuevoPunto.desplazar(entrada.nextDouble(),entrada.nextDouble());
        System.out.print("\nCoordenada desplazada!! \n");
        System.out.print("" +nuevoPunto.coordenadas());
    }
}
