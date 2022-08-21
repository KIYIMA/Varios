
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    /**Constructor CuentaBancaria: inicializa los atributos (int nroCuenta, Persona titular)*/
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);
    }
    /**Constructor CuentaBancaria: inicializa los atributos (int nroCuenta, Persona titular, double saldo)*/
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
    }
    
    
    /**Metodo Setter para el atributo "titular", al cual carga con el valor de tipo Persona que recibe como parametro, devuelve void**/
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    /**Metodo Setter para el atributo "nroCuenta", al cual carga con el valor de tipo int que recibe como parametro, devuelve void**/
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    /**Metodo Setter para el atributo "saldo", al cual carga con el valor de tipo double que recibe como parametro, devuelve void**/
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    /**Metodo Getter para atributo "titular", acceso publico, devuelve dato de tipo Persona*/
    public Persona getTitular(){
        return this.titular;
    }
    /**Metodo Getter para atributo "nroCuenta", acceso publico, devuelve dato de tipo int*/
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    /**Metodo Getter para atributo "saldo", acceso publico, devuelve dato de tipo double*/
    public double getSaldo(){
        return this.saldo;
    }
    
    
    /**Suma el valor (double) recibido como parametro al atributo saldo y retorna el nuevo valor de dicho atributo, metodo de acceso publico*/
    public double depositar (double p_importe){
        this.setSaldo(getSaldo() + p_importe);
        return this.getSaldo();
    }
    /**Resta el valor (double) recibido como parametro al atributo saldo y retorna el nuevo valor de dicho atributo, metodo de acceso publico*/
    public double extraer(double p_importe){
        this.setSaldo(getSaldo() - p_importe);
        return this.getSaldo();
    }
    /**Muestra los datos de la cuenta bancaria, no recibe parametros, metodo de acceso publico*/
    public void mostrar(){
        System.out.print("\n- Cuenta Bancaria -\nTitular: " + this.getTitular().nomYApe()+ "("+this.getTitular().edad()+ " años) \nSaldo: " +this.getSaldo());
    }
    /**Muestra la edad del titular, retorna void, no recibe parametros, es un metodo de acceso publico*/
    public void mosAños(){
        System.out.print("\nEdad:"+this.getTitular().edad());
    }
    /**Retorna una cadena de caracter con los datos de la cuenta bancaria, no recibe parametros, metodo de acceso publico*/
    public String toString(){
        return (this.getNroCuenta() + "\t" + this.getTitular().nomYApe() + "\t" + this.getSaldo());
    }
}
