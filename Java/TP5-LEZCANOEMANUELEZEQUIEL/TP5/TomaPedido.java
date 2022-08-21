
/**
 * Write a description of class TomaPedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class TomaPedido
{
    
    public static void main (String []args){
        Calendar fechaHoy = new GregorianCalendar();
        Laboratorio laboratorio1 = new Laboratorio("FarmaLab", "san juan 567", "11-54986572", 4, 5);
        Producto productos = new Producto(444, "Medicamentos", "Ibuprofeno 400mg", 3000, 4, 3, laboratorio1);
        Producto productos1 = new Producto(444, "Medicamentos", "Paracetamol 500mg", 4000, 4, 3, laboratorio1);
        ArrayList <Producto> pedido0 = new ArrayList();
        Cliente cliente1 = new Cliente(43000567, "Lopez", "Julio", 10000); 
        
        Pedido pedido1 = new Pedido(fechaHoy, cliente1, pedido0);
        
        pedido1.agregarProducto(productos);
        pedido1.agregarProducto(productos1);
        pedido1.mostrarPedido();
        
        pedido1.quitarProducto(productos1);
        pedido1.mostrarPedido();
    }

}
