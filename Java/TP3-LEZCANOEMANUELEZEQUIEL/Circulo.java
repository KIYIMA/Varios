
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Circulo
{
    private double radio;
    private Punto centro;
    
    
    Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    Circulo(){
        this.setRadio(0.0);
    }
    
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    public double getRadio(){
        return radio;
    }
    public void desplazarC(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    public void caracteristicas(){
        System.out.print("\n****** Circulo ****** \nCentro: " + getCentro().coordenadas() + "\t- Radio: " +getRadio()+ "\nSuperficie: " +superficie()+ " - Perimetro: "+ perimetro());
    }
    public double perimetro(){
        return (2 * Math.PI * getRadio());
    }
    public double superficie(){
        return (Math.PI * (Math.pow(getRadio(), 2)));
    }
    public double distanciaA(Circulo otroCirculo){
        return getCentro().distancia(otroCirculo.getCentro());
    }
    public Circulo elMayor(Circulo otroCirculo){
        
        if(this.superficie() > otroCirculo.superficie()){
            return this;
        }else {
            return otroCirculo;
        }
    }
}
