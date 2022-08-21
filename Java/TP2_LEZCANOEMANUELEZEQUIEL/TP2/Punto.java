
/**
 * Con el propósito de trabajar con figuras geométricas, se modela como
   colaborador, el concepto “punto”, que participará más adelante en la 
   construcción de figuras (por ejemplo, el centro de un círculo). Para ello se 
   abstraen las características básicas de un punto, y se lo dota de 
   comportamiento. Un punto tiene dos propiedades relevantes: la abscisa X y 
   la ordenada Y en el plano.
 * 
 * @author (Lezcano Emanuel Ezequiel) 
 * @version (1.0)
 */
public class Punto
{
    /**Declaracion de atributos*/
    private double x;
    private double y;
    
    /**Doble encapsulamiento del constructor Punto*/
    Punto(){
        this.x = 0.0;
        this.y = 0.0;
    }
    Punto (double p_x, double p_y){
        this.x = p_x;
        this.y = p_y;
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
    public void desplazar(double p_dx, double p_dy){
        this.setX(getX() + p_dx);
        this.setY(getY() + p_dy);
    }
    public String coordenadas(){
        return ("\n("+ getX() + ", " + getY() + ")");
    }
        public void mostrar(){
            System.out.print("\nPunto. X: " +getX()+ ", Y:" +getY());
    }
}
