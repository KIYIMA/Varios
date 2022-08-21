
/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 

import java.util.*;
public class Pedido
{
    private Calendar fecha;
    private ArrayList <Producto> pedidos;
    private Cliente cliente;
    private Producto producto;
    
    /**Constructor Pedido: inicializador de atributos (Calendar p_fecha, Cliente p_cliente, ArrayList p_productos)*/
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos)
    {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setArray(p_productos);
    }
    /**Constructor Pedido: inicializador de atributos (Calendar p_fecha, Cliente p_cliente, Producto p_productos)*/
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_productos)
    {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    
    /**Metodo Setter para atributo "fecha", carga el atributo con el dato (Calendar) que recibe como parametro, devuelve void*/
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    /**Metodo Setter para atributo "cliente", carga el atributo con el objeto de tipo Cliente que recibe como parametro, devuelve void*/
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    /**Metodo Setter para atributo "pedidos", carga el atributo con el objeto de tipo ArrayList que recibe como parametro, devuelve void*/
    private void setArray(ArrayList p_productos){
        this.pedidos = p_productos;
    }
    /**Metodo Setter para atributo "producto", carga el atributo con el objeto de tipo Producto que recibe como parametro, devuelve void*/
    private void setProductos(Producto p_productos){
        this.producto = p_productos;
    }
    
    
    /**Metodo Getter para atributo "fecha", devuelve un objeto de tipo Calendar de dicho atributo, no recibe parametros*/
    public Calendar getFecha(){
        return this.fecha;
    }
    /**Metodo Getter para atributo "cliente", devuelve un objeto de tipo Cliente de dicho atributo, no recibe parametros*/
    public Cliente getCliente(){
        return this.cliente;
    }
    /**Metodo Getter para atributo "pedidos", devuelve un objeto de tipo ArrayList de dicho atributo, no recibe parametros*/
    public ArrayList getProductos(){
        return this.pedidos;
    }
    /**Metodo Getter para atributo "producto", devuelve un objeto de tipo Producto de dicho atributo, no recibe parametros*/
    public Producto getProducto(){
        return this.producto;
    }
    
    
    /**Devuelve la suma total de todos los valores correspondientes a el precio de contado de cada producto, el metodo es de acceso publico y no recibe parametros*/
    public double totalAlContado(){
        double totalContado = 0.0;
        for(Producto e: pedidos){
            totalContado = totalContado + e.precioContado();
        }
        return totalContado;
    }
    /**Devuelve la suma total de todos los valores correspondientes a el precio de lista de cada producto, el metodo es de acceso publico y no recibe parametros*/
    public double totalFinanciado(){
        double totalFinanciado = 0.0;
        for(Producto e: pedidos){
            totalFinanciado = totalFinanciado + e.precioLista();
        }
        return totalFinanciado;
    }
    /**Agrega un objeto de tipo Producto el cual recibe como parametro, retorna el valor de la operacion, el metodo es de acceso publico*/
    public boolean agregarProducto(Producto p_producto){
        return getProductos().add(p_producto);
    }
    /**Elimina un objeto de tipo Producto el cual recibe como parametro, retorna el valor de la operacion, el metodo es de acceso  publico*/
    public boolean quitarProducto(Producto p_producto){
        return getProductos().remove(p_producto);
    }
    /**Muestra los producto detalladamente y al final informa el total financiado y el total al contado, retorna void, el metodo es de acceso publico*/
    public void mostrarPedido(){
        Calendar mCalendar = Calendar.getInstance();    
        String month = mCalendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());

        System.out.print("\n****** Detalle del pedido ******  Fecha: " +this.getFecha().get(Calendar.DATE)+ " de " +month+ " de "+this.getFecha().get(Calendar.YEAR));
        System.out.print("\nProducto\t\tPrecio de lista \t Precio de contado");
        System.out.print("\n------------------------------------------------------------------");
        for(Producto e: pedidos){
            System.out.print("\n"+e.getDescripcion()+ "\t\t"+e.precioLista()+ " \t\t\t "+e.precioContado());
        }
        System.out.print("\n------------------------------------------------------------------");
        System.out.print("\n**** Total--------------------- "+this.totalFinanciado()+ "\t\t\t " +this.totalAlContado());
    }
}
