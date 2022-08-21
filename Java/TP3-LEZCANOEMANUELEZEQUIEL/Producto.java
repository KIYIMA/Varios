
/**
 * Write a description of class Prooducto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
 
public class Producto 
{
    /**Declaracion de atributos*/
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio labora;
    /**
     * Constructor Laboratorio
       Caonstructor sombrecargado
    */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_exitMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_exitMinima);
        this.setP_lab(p_lab);
    }
    public Producto( int p_codigo,  String p_rubro,  String p_desc,  double p_costo,  Laboratorio p_laboratorio){
        this.setP_lab(p_laboratorio);
        this.setStock(0);
    }
    /**accesors SETTERS **/
    private void setP_lab(Laboratorio p_lab){
        this.labora = p_lab;
    }
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    private void setCosto(Double p_costo){
        this.costo = p_costo;
    }
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    private void setPorcPtoRepo(double p_porcPtoRepo){
        
    }
    private void setExistMinima(int p_existMinima){
        
    }
    
    /**accesors GETTERS **/
    public int getCodigo(){
        return codigo;
    }
    public String getRubro(){
        return rubro;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getCosto(){
        return costo;
    }
    public int getStock(){
        return stock;
    }
    public double getPorcPtoRepo(){
        return porcPtoRepo;
    }
    public int getExistMinima(){
        return existMinima;
    }
    public Laboratorio getP_lab(){
        return labora ;
    }
    
    /** Muestra**/
    public void mostrar(){
        System.out.print("\n" + getP_lab().mostrarDatos() + "\n\nRubro: " +getRubro()+ "\nDescripcion: "+getDescripcion()+ "\nPrecio Costo: " +getCosto()+ "\nStock: " + getStock()+ " - Stock Valorizado: $" + stockValorizado());
    }
    
    public void ajuste( int p_cantidad){
        this.setStock(getStock() + p_cantidad);
    }
    
    public double stockValorizado(){
        return ((getStock() * getCosto()) + ((getStock() * getCosto()) * 0.12));
    }
    
    public double precioLista(){
        return ( getCosto() + (getCosto() * 0.12));
    }
    
    public double precioContado(){
        return (getCosto() - (getCosto() * 0.05));
    }
    
    public String mostrarLinea(){
        return ("\n" + getDescripcion() + "\t" +precioLista() + "\t" + precioContado());
    }
    
    public void ajustarPtoRepo( double p_porce){
        this.porcPtoRepo = p_porce;
    }
    
    public void ajustarExistMin(int p_cantidad){
        this.existMinima = p_cantidad;
    }
    
}
