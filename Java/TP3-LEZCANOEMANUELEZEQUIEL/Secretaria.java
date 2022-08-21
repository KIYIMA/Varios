
/**
 * Write a description of class Secretaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Secretaria
{
    public static void main(String []args){
        Docente docente1 = new Docente("Vera Milagros","4to",25000, 5000);
        Escuela escuela1 = new Escuela("Jorge Newbery","San Francisco 2344","Julio Martinez");
        escuela1.imprimirRecibo(docente1);
        
    }
}
