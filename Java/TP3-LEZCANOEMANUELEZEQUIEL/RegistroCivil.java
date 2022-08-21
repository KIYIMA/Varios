
/**
 * Write a description of class RegistroCivil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistroCivil
{
    public static void main(String []args){
        Hombre hombre1 = new Hombre("Julio","Lopez",23);
        Mujer mujer1 = new Mujer("Julia","Diaz",25);
        
        Hombre hombre2 = new Hombre("Daniel","Vera", 24 ,mujer1);
        Mujer mujer2 = new Mujer("Micaela","Romero", 30, hombre1);
        
        hombre2.mostrarEstadoCivil();
        hombre2.casarseCon(mujer2);
        hombre2.mostrarEstadoCivil();
        System.out.print("\nDatos: " +hombre2.datos());
        hombre2.casadoCon();
        
        mujer2.mostrarEstadoCivil();
        mujer2.casarseCon(hombre1);
        mujer2.mostrarEstadoCivil();
        System.out.print("\nDatos: " +mujer2.datos());
        mujer2.casadoCon();
    }
}
