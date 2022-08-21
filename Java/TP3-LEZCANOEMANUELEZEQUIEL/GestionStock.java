
/**
 * Write a description of class EjecutaProducto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class GestionStock
{
    public static void main(String []args){
        Laboratorio nuevLaboratorio = new Laboratorio("Colgate S.A", " Scalabrini Ortiz 5524", "54-11 -4239-8447", 20, 12_9_2021);
        Producto nueProducto = new Producto(2222, "Perfumería", " Jabón Deluxe", 5.25, 5, 20, nuevLaboratorio);
        nueProducto.ajuste(500);
        nueProducto.stockValorizado();
        
        nueProducto.mostrar();
        System.out.print("\n " +nueProducto.mostrarLinea());
        
        nueProducto.ajuste(-200);
        nueProducto.mostrar();
        System.out.print("\nPrecio Lista: $ " +nueProducto.precioLista()+ "\tPrecio Contado: $ "+ nueProducto.precioContado());
    }
}
