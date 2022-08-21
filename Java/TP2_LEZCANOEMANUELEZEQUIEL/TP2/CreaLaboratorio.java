
/**
 * Write a description of class CreaLaboratorio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreaLaboratorio
{
    public static void main(String [] args){
        Laboratorio labo= new Laboratorio("Toyota", "Torres 678", "3785-342111", 4, 5);
        System.out.print(""+ labo.mostrar());
        Laboratorio lab= new Laboratorio("Samsung", "ert 321", "3785-555555");
        System.out.print(""+ lab.mostrar());
        System.out.print(""+ labo.mostrar());
        
    }
}
