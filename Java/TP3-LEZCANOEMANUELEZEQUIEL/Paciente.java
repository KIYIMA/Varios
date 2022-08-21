
/**
 * Write a description of class Paciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paciente
{
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad nacido;
    private Localidad vive;
    
    public Paciente(int p_historia,  String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive)
    {
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }
    
    private void setHistoriaClinica(int p_historia){
        this.historiaClinica = p_historia;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    public int getHistoriaClinica(){
        return this.historiaClinica;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    
    private void setNacido(Localidad p_nacido){
        this.nacido = p_nacido;
    }
    private void setVive(Localidad p_vive){
        this.vive = p_vive;
    }
    public Localidad getNacido(){
        return this.nacido;
    }
    public Localidad getVive(){
        return this.vive;
    }
    
    public void mostrarDatosPantalla(){
        System.out.print("\n\tPasiente: " +getNombre()+ "\tHostoria Clinica: "+getHistoriaClinica()+ "\tDomicilio: "+getDomicilio()+ "\n\tLocalidad: "+getNacido().getNombre()+ "\t\tProvincia: "+getNacido().getProvincia());
    }
    public String cadenaDeDatos(){
        return ("\n\t" +getNombre() + "......" + getHistoriaClinica() + "......" + getDomicilio() + " - " + getNacido().getNombre() + " - " + getNacido().getProvincia());
    }
}
