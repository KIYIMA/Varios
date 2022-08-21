
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
    //Declaracion de atributos
    private int nroDNI= 0;
    private String apellido= "";
    private String nombre= "";
    private double saldo= 0;
    
    /**Constructor Cliente inicializador de atributos (int p_nroDNI, String p_apellido, String p_nombre, double p_saldo)*/
    public Cliente(int p_nroDNI, String p_apellido, String p_nombre, double p_saldo){
        this.setDNI(nroDNI);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSaldo(p_saldo);
    }
    
    
    /**Metodo Setter para atributo "nroDNI", carga el atributo con el dato de tipo "int" que recibe como parametro, devuelve void*/
    private void setDNI(int p_nroDni)
    {
        this.nroDNI= p_nroDni;
    }
    /**Metodo Setter para atributo "nombre", carga el atributo con el dato de tipo "String" que recibe como parametro, devuelve void*/
    private void setNombre(String p_nombre)
    {
        this.nombre= p_nombre;
    }
    /**Metodo Setter para atributo "apellido", carga el atributo con el dato de tipo "String" que recibe como parametro, devuelve void*/
    private void setApellido(String p_apellido)
    {
        this.apellido= p_apellido;
    }
    /**Metodo Setter para atributo "saldo", carga el atributo con el dato de tipo "double" que recibe como parametro, devuelve void*/
    private void setSaldo(double p_saldo)
    {
        this.saldo= p_saldo;
    }
    
    
    /**Metodo Getter para atributo "nroDNI", devuelve el valor (int) de dicho atributo, no recibe parametros*/
    public int getDNI(){
        return this.nroDNI;
    }
    /**Metodo Getter para atributo "nombre", devuelve el valor (String) de dicho atributo, no recibe parametros*/
    public String getNombre(){
        return this.nombre;
    }
    /**Metodo Getter para atributo "apellido", devuelve el valor (String) de dicho atributo, no recibe parametros*/
    public String getApellido(){
        return this.apellido;
    }
    /**Metodo Getter para atributo "saldo", devuelve el valor (double) de dicho atributo, no recibe parametros*/
    public double getSaldo(){
        return this.saldo;
    }
    
    /**Muestra datos cargados (Nombre Apellido (DNI)), no recibe parametros, es de acceso publico, devuelve void.  */
    public void mostrar (){
        System.out.print("\n-Cliente- \nNombre y Apellido: "+ this.getNombre() +" "+this.getApellido()+ "(" +this.getDNI() + ")\nSaldo: $"+this.getSaldo());
    }
    /**Actualiza el saldo sumando a este, el valor (double) que recibe como parametro, es de acceso publico, devuelve el nuevo saldo.  */
    public double agregaSaldo(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    /**Actualiza el saldo pisando a este, con el valor (double) que recibe como parametro, es de acceso publico, devuelve el nuevo saldo*/
    public double nuevoSaldo(double p_importe){
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    /**Devuelve una cadena de caracter con el siguiente formato "apellido nombre", es de acceso publico y no recibe parametros*/
    public String apeYnom(){
        return (this.getApellido() + " " + this.getNombre());
    }
    /**Devuelve una cadena de caracter con el siguiente formato "nombre apellido", es de acceso publico y no recibe parametros*/
    public String nomYape(){
        return (this.getNombre() + " " + this.getApellido());
    }
}
