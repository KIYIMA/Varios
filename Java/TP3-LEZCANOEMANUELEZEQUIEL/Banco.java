
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    public static void main(String []args)
    {
        Persona titular1 = new Persona(55666777, "Julio", "Lopez", 1997);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(222, titular1, 15000);
        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(223, titular1, 20000);
        
        cajaDeAhorro1.extraer(15000);
        cajaDeAhorro1.mostrar();
        cajaDeAhorro1.extraer(6000);
        cajaDeAhorro1.depositar(2000);
        cajaDeAhorro1.mostrar();
    }
}
