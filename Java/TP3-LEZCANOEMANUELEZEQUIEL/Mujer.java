
/**
 * Write a description of class Mujer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mujer
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
    }
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposo(p_esposo);
        this.setEstadoCivil("soltera");
    }
    
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    
    public Hombre getEsposo(){
        return this.esposo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    public void casarseCon(Hombre p_hombre){
        if(((p_hombre.getEstadoCivil() == "divorciada") || (p_hombre.getEstadoCivil() == "soltera")) ){
                this.setEstadoCivil("casada");
        }else{
            if((p_hombre.getEstadoCivil() == null)){
                this.setEstadoCivil("casada");
                Mujer aux = new Mujer(getNombre(), getApellido(), getEdad(), getEsposo());
                p_hombre.casarseCon(aux);
            }else{
                System.out.print("\n\tNo puede casarse con quien ya está casado.");
            }
        }  
    }
    
    public void divorcio(){
        if(getEstadoCivil() == "casada"){
            this.setEstadoCivil("divorciada");
        }else{
            System.out.print("\n\tNo puede divorciarse si aun no se casa.");
        }
    }
    public String datos(){
        return (getNombre() + getApellido() + " de " +getEdad()+ " años");
    }
    public void mostrarEstadoCivil(){
        System.out.print("\n"+ datos() +" - " +getEstadoCivil());
    }
    public void casadoCon(){
        System.out.print("\n\t"+getNombre()+" "+getApellido()+ " de "+ getEdad()+" está "+getEstadoCivil()+ " con "+getEsposo().getNombre()+" "+getEsposo().getApellido()+ " de " +getEsposo().getEdad() + " años");
    }
}
