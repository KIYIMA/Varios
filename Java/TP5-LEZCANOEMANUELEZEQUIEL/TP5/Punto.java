
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Punto
{
    private double x;
    private double y;
    /**Constructor: inicializador a 0**/
    Punto (){
        
    }
    /**Constructor: nesesita dos argumentos de tipo double para crear un objeto de tipo Punto**/
    Punto (double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    } 
    
    /**Metodo Setter para atributo "x", acceso privado, requiere un valor de tipo double, devuelve void**/
    private void setX(double p_x){
        this.x = p_x;
    }
    /**Metodo Setter para atributo "y", acceso privado, requiere un valor de tipo double, devuelve void**/
    private void setY(double p_y){
        this.y = p_y;
    }
    
    /**Metodo Getter para atributo "x", acceso publico, devuelve dato de tipo double*/
    public double getX(){
        return x;
    }
    /**Metodo Getter para atributo "y", acceso publico, devuelve dato de tipo double*/
    public double getY(){
        return y;
    }
    
    /**Metodo distancia: acceso publico, devuelve un dato de tipo double que correspondea la distancia entre en punto y otro, nesesita un objeto de tipo punto como argumento*/
    public double distancia(Punto p_puntoDistante){
        return ( Math.sqrt(Math.pow((p_puntoDistante.getX() - getX()), 2) + (Math.pow((p_puntoDistante.getY() - getY()), 2))) );
    }
    /**Metodo desplazar: acceso publico, devuelve void, desplaza el punto hacia las nuevas coordenadas que se le indican como argumentos, que son de tipo double*/
    public void desplazar(double p_dx, double p_dy){
        this.setX(getX() + p_dx);
        this.setY(getY() + p_dy);
    }
    /**Metodo coordenadas: acceso publico, no requiere argumentos, devuelve un dato de tipo String que corresponde a las coordenadas del objeto Punto*/
    public String coordenadas(){
        return ("("+ getX() + ", " + getY() + ")");
    }
    /**Metodo mostrar: acceso publico, no requiere argumentos, imprime una leyenda con las coordenadas del objeto de tipo Punto, devuelve void, */
        public void mostrar(){
            System.out.print("\nPunto. X: " +getX()+ ", Y:" +getY());
    }
}
