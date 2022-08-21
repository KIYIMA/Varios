
/**
 * Write a description of class GestionHospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionHospital
{
    public static void main (String []args){
        Hospital hospi = new Hospital("Vidal", "Noriega Carlos");
        Localidad localNacido = new Localidad("Bella Vista","Corrientes");
        Localidad localVive = new Localidad("Corrientes","Corrientes");
        Paciente paciente1 = new Paciente(444, "ema lezca","san martin 33",localNacido, localVive);
        
        System.out.print("\t"+localNacido.mostrar());
        System.out.print("\t"+localVive.mostrar());
        
        paciente1.mostrarDatosPantalla();
        System.out.print("\t"+paciente1.cadenaDeDatos());
        
        hospi.consultaDatosFiliatorios(paciente1);
    }
}
