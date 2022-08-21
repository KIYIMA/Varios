
/**
 * Un hospital público brinda como servicio hacia sus pacientes, autoridades judiciales, obras sociales, etc., enviarles los 
    datos filiatorios, por correo postal, al domicilio declarado donde vive. Previo al envío, el operador verifica por pantalla 
    los datos del paciente. Para realizar esta tarea, implemente en java el siguiente diagrama de clases, donde se observa un 
    doble conocimiento de la clase Paciente con Localidad. El método mostrar() de Localidad retorna la siguiente cadena 
    (los valores en negrita dependen del estado interno del objeto):
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospital
{
    private String nombreHospital;
    private String nombreDirector;
    
    public Hospital(String p_nombreHospital, String p_nombreDirector){
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }
    private void setNombreHospital(String p_nombreHospital){
        this.nombreHospital = p_nombreHospital;
    }
    private void setNombreDirector(String p_nombreDirector){
        this.nombreDirector = p_nombreDirector;
    }
    public String getNombreDirector(){
        return this.nombreDirector;
    }
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    
    public void consultaDatosFiliatorios(Paciente p_paciente)
    {
        System.out.print("\n\tHospital: "+getNombreHospital()+ "\tDirector: "+getNombreHospital());
        System.out.print("\n\t--------------------------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }
}
