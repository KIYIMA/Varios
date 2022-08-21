
/**
 * Write a description of class CreaFigura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class CreaFigura
{
    public static void main(String []args){
        Random unNumero = new Random();
        double radio = unNumero.nextDouble() * 100.0;
        
        Punto nuevPunto = new Punto(0,0);
        Circulo nuevCirculo = new Circulo(radio, nuevPunto);
        nuevCirculo.caracteristicas();
        
        nuevCirculo.desplazarC(-240, -230);
        nuevCirculo.caracteristicas();
        
        double otroRadio = unNumero.nextDouble() * 100.0;
        Punto otroPunto = new Punto(5.3 ,0.5);
        Circulo otroCirculo = new Circulo(otroRadio, otroPunto);
        otroCirculo.caracteristicas();
        System.out.print("\nDistancia entre circulos: " + nuevCirculo.distanciaA( otroCirculo));
        System.out.print("\n\n¡¡¡¡¡¡ CIRCULO MAS GRANDE !!!!!!!");
        nuevCirculo.elMayor(otroCirculo).caracteristicas();
        
        System.out.print("\n\nRECTANGULO");
        /**CREA RECTANGULO**/
        double ancho = unNumero.nextDouble() * 100.0;
        double alto = unNumero.nextDouble() * 100.0;
        Punto nueOrigen = new Punto(0,0);
        
        Rectangulo nuevRectangulo = new Rectangulo(nueOrigen, alto, ancho);
        nuevRectangulo.caracteristicas();
        nuevRectangulo.desplazarR(40, -20);
        nuevRectangulo.caracteristicas();
        
        Punto otrPunto = new Punto(7.4 ,4.5);
        ancho = unNumero.nextDouble() * 100.0;
        alto = unNumero.nextDouble() * 100.0;
        Rectangulo otroRectangulo = new Rectangulo(otrPunto, alto, ancho);
        otroRectangulo.caracteristicas();
        
        System.out.print("\nDistancia entre RECTANGULOS: " + nuevRectangulo.distancia( otroRectangulo));
        System.out.print("\n\n¡¡¡¡¡¡ RECTANGULO MAS GRANDE !!!!!!!");
        nuevRectangulo.elMayor( otroRectangulo).caracteristicas();
    }
}
