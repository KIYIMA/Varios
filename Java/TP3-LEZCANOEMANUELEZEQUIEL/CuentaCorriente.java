
/**
 * Clase CuentaCorriente: Si la cuenta se instancia sin saldo, este tomará el valor 0. En todos los casos, el límite de 
   descubierto por defecto es $500. El método depositar(p_importe) sólo agrega el importe al saldo actual. El método 
   extraer(p_importe) coordina la operación, de acuerdo a si se cumplen las condiciones de extracción, caso contrario 
   informará el motivo por el cual no se pudo extraer. El método puedeExtraer(p_importe) devuelve true si el importe a retirar 
   no supera el saldo más el límite de descubierto autorizado. El método extraccion(p_importe) es el que realiza efectivamente 
   la extracción. La salida impresa del método mostrar() debe ser la siguiente: (los valores en negrita dependen del estado 
   interno del objeto)
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaCorriente 
{
    private int nroCuenta;
    private double saldo;
    private double descubierto;
    private Persona titular;
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setTitular(p_titular);
        this.setNroCuenta(0);
        this.setSaldo(0.0);
        this.setLimiteDescubierto(500);
    }
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);      
        this.setSaldo(p_saldo);
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
    
    public double getLimiteDescubierto(){
        return this.descubierto;
    }
    private void setLimiteDescubierto(double p_descubierto){
        this.descubierto = p_descubierto;
    }
    private boolean puedeExtraer(double p_importe){
        if((getLimiteDescubierto() + getSaldo())>= p_importe){
            return true;
        }else{
            return false;
        }
    }
    private void extraccion(double p_importe){
        this.setSaldo(getSaldo() - p_importe);
    }
    public void extraer(double p_importe){
        if(puedeExtraer(p_importe)){
            extraccion( p_importe);
        }else{
                System.out.print("\nEl importe de extraccion sobrepasa el límite de descubierto!");
             }
        }
    public void depositar(double p_importe){
        this.setSaldo(getSaldo() + p_importe);
    }
    public void mostrar(){
        System.out.print("\nCuenta Corriente - \n\tNro. Cuenta: "+getNroCuenta()+ " - Saldo: "+getSaldo()+"\n\tTitular: "+getTitular().getNombre()+"\n\tDescubierto: "+getLimiteDescubierto());
    }
}
