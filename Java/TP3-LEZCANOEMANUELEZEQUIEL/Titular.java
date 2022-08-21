
/**
 * Write a description of class Titular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titular
{
    public static void main(String []args){
        Persona titular1 = new Persona(44555666, "Ema", "Ramirez", 1998);
        CuentaBancaria cuenta1 = new CuentaBancaria(1515, titular1, 10000);
        
        cuenta1.mosAños();
        
        cuenta1.mostrar();
        System.out.print("\n"+cuenta1.toStrinf());
        
        cuenta1.depositar(5000);
        cuenta1.mostrar();
        cuenta1.extraer(3000);
        cuenta1.mostrar();
        
    }
}
