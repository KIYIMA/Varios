
/**
 * En la clase Cliente, el método 
   agregaSaldo(p_importe) agrega p_importe al 
   saldo actual (lo actualiza) y devuelve el nuevo 
   saldo. El método nuevoSaldo(p_importe)
   reemplaza el saldo actual por p_importe y 
   devuelve el nuevo saldo. La salida impresa del 
   método mostrar() debe ser la siguiente: (los 
   valores en negrita dependen del estado interno 
   del objeto)
 * 
 * @author (Lezcano Emanuel Ezequiel) 
 * @version (1.0)
 */
public class Cliente
{
    /**Declaracion de atributos*/
    private int nroDNI= 0;
    private String apellido= "";
    private String nombre= "";
    private double saldo= 0;
    /**Constructor Cliente*/
    public Cliente(int p_nroDNI, String p_apellido, String p_nombre, double p_saldo){
        this.nroDNI = p_nroDNI;
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.saldo = p_saldo;
    }
    void mostrar (){
        System.out.print("\n-Cliente- \nNombre y Apellido: "+ nombre +" "+apellido+ "(" +nroDNI + ")\nSaldo: $"+saldo);
    }
    double agregaSaldo(double p_importe){
        saldo = saldo + p_importe;
        return saldo;
    }
    double nuevoSaldo(double p_importe){
        saldo = p_importe;
        return saldo;
    }
    String apeYnom(){
        return (apellido + " " + nombre);
    }
    String nomYape(){
        return (nombre + " " + apellido);
    }
}
