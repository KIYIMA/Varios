
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
    
    Punto (){
        
    }
    Punto (double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    } 
    
    private void setX(double p_x){
        this.x = p_x;
    }
    private void setY(double p_y){
        this.y = p_y;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distancia(Punto p_puntoDistante){
        return ( Math.sqrt(Math.pow((p_puntoDistante.getX() - getX()), 2) + (Math.pow((p_puntoDistante.getY() - getY()), 2))) );
    }
    public void desplazar(double p_dx, double p_dy){
        this.setX(getX() + p_dx);
        this.setY(getY() + p_dy);
    }
    public String coordenadas(){
        return ("("+ getX() + ", " + getY() + ")");
    }
        public void mostrar(){
            System.out.print("\nPunto. X: " +getX()+ ", Y:" +getY());
    }
}
