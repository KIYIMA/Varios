
/**
 * Write a description of class NuevoCliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NuevoCliente
{
    
    public static void main(String []args)
    {
        Cliente client= new Cliente(Integer.valueOf(args[0]), String.valueOf(args[1]), String.valueOf(args[2]), Double.valueOf(args[3]));
        client.mostrar();
        client.agregaSaldo(5580);
        client.mostrar();
        client.nuevoSaldo(8000);
        System.out.print("\nNombre y apellido: " + client.nomYape());
        System.out.print("\nApellido y nombre: " + client.apeYnom());
    }
}
