
/**
 * Un banco necesita modelar el concepto de cuenta bancaria, que debe 
 *  permitir depósitos y retiros. El método
    depositar (p_importe) aumenta el saldo actual con el monto pasado 
    como parámetro. El método extraer (p_importe) disminuye el saldo 
    actual. Ambos métodos devuelven el saldo resultante después de la
    operación. El modelo está representado en el siguiente diagrama de clases.
 * 
 *  La pantalla de salida del método
    mostrar () debe ser el siguiente (
    Los valores en negrita dependen de los valores internos.
    estado del objeto):
    
    El método toString (), devuelve una cadena, compuesta por la concatenación de los datos (número, titular, saldo), tabulados.

 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);
    }
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    public Persona getTitular(){
        return titular;
    }
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    public int getNroCuenta(){
        return nroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public double depositar (double p_importe){
        this.setSaldo(getSaldo() + p_importe);
        return getSaldo();
    }
    public double extraer(double p_importe){
        this.setSaldo(getSaldo() - p_importe);
        return getSaldo();
    }
    public void mostrar(){
        System.out.print("\n- Cuenta Bancaria -\nTitular: " + getTitular().nomYApe()+ "("+getTitular().edad()+ " años) \nSaldo: " +getSaldo());
    }
    public void mosAños(){
        System.out.print("\nEdad:"+getTitular().edad());
    }
    public String toStrinf(){
        return (getNroCuenta() + "\t" + getTitular().nomYApe() + "\t" + getSaldo());
    }
}
