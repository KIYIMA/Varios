
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo
{
    private Punto origen;
    private double ancho;
    private double alto;
    Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    Rectangulo(double p_ancho, double p_alto){
        this.setAlto(p_alto);
        this.setAncho(p_ancho);
        this.getOrigen().desplazar(0,0);
    }
    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    public double getAncho(){
        return ancho;
    }
    public double getAlto(){
        return alto;
    }
    public Punto getOrigen(){
        return origen;
    }
    
    public void desplazarR(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    public void caracteristicas(){
         System.out.print("\n****** Rectangulo ****** \nOrigen: " + getOrigen().coordenadas() + " - Alto: " +getAlto()+ " - Ancho: "+getAncho()+ "\nSuperficie: "+superficie()+ " - Perimetro: " +perimetro());
    }
    public double perimetro(){
        return ((2*getAncho()) + (2 * getAlto())); 
    }
    public double superficie(){
        return (getAncho() * getAlto());
    }
    public double distancia(Rectangulo otroRectangulo){
        return getOrigen().distancia(otroRectangulo.getOrigen());
    }
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }else {
            return otroRectangulo;
        }
    }
    
}
