
/**
 * Write a description of class Prooducto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
 
public class Producto 
{
    //Declaracion de atributos
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    
    /**Constructor Producto inicializador de atributos (int codigo, String rubro, String desc, double costo, double porcPtoRepo, int exitMinima, Laboratorio laboratorio)*/
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_exitMinima, Laboratorio p_laboratorio){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_exitMinima);
        this.setP_lab(p_laboratorio);
    }
    public Producto( int p_codigo,  String p_rubro,  String p_desc,  double p_costo,  Laboratorio p_laboratorio){
        this.setP_lab(p_laboratorio);
        this.setStock(0);
    }
    
    
    /**Metodo Setter para atributo "laboratorio", carga el atributo con el dato de tipo "Laboratorio" que recibe como parametro, devuelve void*/
    private void setP_lab(Laboratorio p_laboratorio){
        this.laboratorio = p_laboratorio;
    }
    /**Metodo Setter para atributo "codigo", carga el atributo con el dato (int) que recibe como parametro, devuelve void*/
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    /**Metodo Setter para atributo "rubro", carga el atributo con el dato (String) que recibe como parametro, devuelve void*/
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    /**Metodo Setter para atributo "descripcion", carga el atributo con el dato (String) que recibe como parametro, devuelve void*/
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    /**Metodo Setter para atributo "costo", carga el atributo con el dato (double) que recibe como parametro, devuelve void*/
    private void setCosto(Double p_costo){
        this.costo = p_costo;
    }
    /**Metodo Setter para atributo "stock", carga el atributo con el dato (int) que recibe como parametro, devuelve void*/
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    /**Metodo Setter para atributo "porcPtoRepo", carga el atributo con el dato (double) que recibe como parametro, devuelve void*/
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    /**Metodo Setter para atributo "existMinima", carga el atributo con el dato (int) que recibe como parametro, devuelve void*/
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    
    
    /**Metodo Getter para atributo "codigo", devuelve el valor (int) de dicho atributo, no requiere argumentos*/
    public int getCodigo(){
        return this.codigo;
    }
    /**Metodo Getter para atributo "rubro", devuelve el valor (String) de dicho atributo, no requiere argumentos*/
    public String getRubro(){
        return this.rubro;
    }
    /**Metodo Getter para atributo "descripcion", devuelve el valor (String) de dicho atributo, no requiere argumentos*/
    public String getDescripcion(){
        return descripcion;
    }
    /**Metodo Getter para atributo "costo", devuelve el valor (double) de dicho atributo, no requiere argumentos*/
    public double getCosto(){
        return this.costo;
    }
    /**Metodo Getter para atributo "stock", devuelve el valor (int) de dicho atributo, no requiere argumentos*/
    public int getStock(){
        return this.stock;
    }
    /**Metodo Getter para atributo "porcPtoRepo", devuelve el valor (double) de dicho atributo, no requiere argumentos*/
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    /**Metodo Getter para atributo "existMinima", devuelve el valor (int) de dicho atributo, no requiere argumentos*/
    public int getExistMinima(){
        return this.existMinima;
    }
    /**Metodo Getter para atributo "laboratorio", devuelve un objeto de tipo "Laboratorio" de dicho atributo, no requiere argumentos*/
    public Laboratorio getP_lab(){
        return this.laboratorio ;
    }
    
    
    /**Muestra datos cargados, no requiere argumentos, es de acceso publico, devuelve void.  */
    public void mostrar(){
        System.out.print("\n" + this.getP_lab().mostrarDatos() + "\n\nRubro: " +this.getRubro()+ "\nDescripcion: "+this.getDescripcion()+ "\nPrecio Costo: " +this.getCosto()+ "\nStock: " + this.getStock()+ " - Stock Valorizado: $" + this.stockValorizado());
    }
    /**Actualiza el Stock de la empresa sumando lo que se le pasa por parametro (int) al Stock actual*/
    public void ajuste( int p_cantidad){
        this.setStock(this.getStock() + p_cantidad);
    }
    /**Devuelve el resultado de multiplicar el stock por el precio de costo, más una rentabilidad de 12% */
    public double stockValorizado(){
        return ((this.getStock() * this.getCosto()) + ((this.getStock() * this.getCosto()) * 0.12));
    }
    /**Metodo de acceso publico, no requiere argumentos, devuelve el valor que resulta de agregar un 12% al precio de costo.*/
    public double precioLista(){
        return ( this.getCosto() + (this.getCosto() * 0.12));
    }
    /**Metodo de acceso publico, no requiere argumentos, devuelve el precio por pago al contado del producto, que se calcula restando un 5% al precio de lista*/
    public double precioContado(){
        return (this.precioLista() - (this.getCosto() * 0.05));
    }
    /**Metodo de acceso publico, no requiere argumentos, retorna el la descripcion, el precio de lista, el precio de Contado*/
    public String mostrarLinea(){
        return ("\n" + this.getDescripcion() + "\t" +this.precioLista() + "\t" + this.precioContado());
    }
    /**Metodo de acceso publico, actualiza el porcentaje de punto de reposicion con el valor (double) pasado como argumento, retorna void*/
    public void ajustarPtoRepo( double p_porce){
        this.porcPtoRepo = p_porce;
    }
    /**Metodo de acceso publico, actualiza el existencia minima con el valor (int) pasado como argumento, retorna void*/
    public void ajustarExistMin(int p_cantidad){
        this.existMinima = p_cantidad;
    }
    
}

