
/**
 * Clase CajaDeAhorro: Si la cuenta se instancia sin saldo, este tomará el valor 0. En todos los casos, la cantidad máxima 
   de extracciones es 10. El método depositar(p_importe) sólo agrega el importe al saldo actual. El método extraer(p_importe)
   coordina la operación, de acuerdo a si se cumplen las condiciones de extracción, si no pudiera informará el motivo por el 
   cual no se pudo extraer. El método puedeExtraer(p_importe) devuelve true si el importe a retirar no supera el saldo 
   disponible y si aún no usó todas las extracciones posibles. El método 
   extraccion(p_importe) es el que realiza efectivamente la extracción y descuenta 1 al número de extracciones posibles. 
   La salida impresa del método mostrar() debe ser la siguiente: (los valores en negrita dependen del estado interno del objeto)
 * 
 * Si no puede extraer el mensaje debe ser: El importe de extraccion sobrepasa el límite de descubierto!
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CajaDeAhorro 
{
    private int nroCuenta;
    private double saldo;
    private int extracciones;
    private Persona titular;
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setTitular(p_titular);
        this.setNroCuenta(0);
        this.setExtraccionesPosibles(10);
    }
    //tTitular = new Persona(p_titular.getDNI(), p_titular.getNombre(), p_titular.getApellido(), p_titular.getAnioNacimiento());
        //extends Persona
        //super(p_titular.getDNI(), p_titular.getNombre(), p_titular.getApellido(), p_titular.getAnioNacimiento());
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);      
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
    }
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;   
    }
    
    public Persona getTitular(){
        return titular;
    }
    private void setTitular(Persona p_titular){
         this.titular = p_titular;
    }
    
    public int getExtraccionesPosibles(){
        return this.extracciones;
    }
    private void setExtraccionesPosibles(int p_extracciones){
        this.extracciones = p_extracciones;
    }
    private boolean puedeExtraer(double p_importe){
        if((p_importe <= getSaldo()) && (getExtraccionesPosibles() > 0)){
            return true;
        }else{
            return false;
        }
    }
    private void extraccion(double p_importe){
        this.setSaldo(getSaldo() - p_importe);
        this.setExtraccionesPosibles(getExtraccionesPosibles() - 1);
    }
    public void extraer(double p_importe){
        if(puedeExtraer(p_importe)){
            extraccion( p_importe);
        }else{
            if((p_importe > getSaldo())){
                System.out.print("\nNo puede extraer mas que el saldo!");
            }else{
                System.out.print("\nNo tiene habilitadas mas extracciones!");
            }
        }
    }
    public void depositar(double p_importe){
        this.setSaldo(getSaldo() + p_importe);
    }
    public void mostrar(){
        System.out.print("\nCaja de Ahorro - \n\tNro. Cuenta: "+ getNroCuenta() + " - Saldo: " + getSaldo() +"\n\t Titular: " +titular.getNombre()+"\n\tExtracciones posibles: "+getExtraccionesPosibles());
    }
}
