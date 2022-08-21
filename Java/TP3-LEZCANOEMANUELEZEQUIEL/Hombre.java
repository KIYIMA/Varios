
/**
 * Write a description of class Hombre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hombre
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    public Hombre(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
    }
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposa(p_esposa);
        this.setEstadoCivil("soltero");
    }
    
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
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
    
    public Mujer getEsposa(){
        return this.esposa;
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
    
    public void casarseCon(Mujer p_mujer){
        if(((p_mujer.getEstadoCivil() == "divorciada") || (p_mujer.getEstadoCivil() == "soltera")) ){
                this.setEstadoCivil("casado");
        }else{
            if((p_mujer.getEstadoCivil() == null)){
                this.setEstadoCivil("casado");
                Hombre aux = new Hombre(getNombre(), getApellido(), getEdad(), getEsposa());
                p_mujer.casarseCon(aux);
            }else{
                System.out.print("\n\tNo puede casarse con quien ya está casado.");
            }
        }  
    }

    public void divorcio(){
        if(getEstadoCivil() == "casado"){
            this.setEstadoCivil("divorciado");
        }else{
            System.out.print("\n\tNo puede divorciarse si aun no se casa.");
        }
    }
    public String datos(){
        return (getNombre() + " " + getApellido() + " de " +getEdad()+ " años");
    }
    public void mostrarEstadoCivil(){
        System.out.print("\n"+ datos() +" - " +getEstadoCivil());
    }
    public void casadoCon(){
        System.out.print("\n\t"+datos() +" está "+ getEstadoCivil()+ " con "+getEsposa().datos());
    }
}
