
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1 =0.0;
    private double nota2 =0.0;
    /**Constructor Alumno inicializa los tributos (int p_lu, String p_nombre, String p_apellido)*/
    public Alumno(int p_lu, String p_nombre, String p_apellido){
        this.setLu(p_lu);
        this.nombre= p_nombre;
        this.apellido= p_apellido;
    }
    /**Constructor Alumno inicializa objeto a cero*/
    public Alumno(){
        
    }
    
    
    /**Metodo Setter para atributo "lu", carga el atributo con el dato de tipo int que recibe como parametro, devuelve void*/
    private void setLu(int p_lu){
        this.lu= p_lu;
    }
    /**Metodo Setter para atributo "nota1", carga el atributo con el dato de tipo double que recibe como parametro, devuelve void*/
    public void setNota1(double p_nota){
        this.nota1= p_nota;
    }
    /**Metodo Setter para atributo "nota2", carga el atributo con el dato de tipo double que recibe como parametro, devuelve void*/    
    public void setNota2(double p_nota){
        this.nota2= p_nota;
    }
    /**Metodo Setter para atributo "nombre", carga el atributo con el dato de tipo String que recibe como parametro, devuelve void*/    
    public void setNombre(String p_nombre){
        this.nombre= p_nombre;
    }
    /**Metodo Setter para atributo "apellido", carga el atributo con el dato de tipo String que recibe como parametro, devuelve void*/    
    public void setApellido(String p_Apellido){
        this.apellido= p_Apellido;
    }
    
    
    /**Metodo Getter para atributo "lu", devuelve un dato de tipo int de dicho atributo, no recibe parametros*/
    public int getLu(){
        return this.lu;
    }
    /**Metodo Getter para atributo "nota1", devuelve un dato de tipo double de dicho atributo, no recibe parametros*/
    public double getNota1(){
        return this.nota1;
    }
    /**Metodo Getter para atributo "nota2", devuelve un dato de tipo double de dicho atributo, no recibe parametros*/
    public double getNota2(){
        return this.nota2;
    }
    /**Metodo Getter para atributo "nombre", devuelve un dato de tipo String de dicho atributo, no recibe parametros*/
    public String getNombre(){
        return this.nombre;
    }
    /**Metodo Getter para atributo "apellido", devuelve un dato de tipo String de dicho atributo, no recibe parametros*/
    public String getApellido(){
        return this.apellido;
    }
    
    
    /**Retorna un valor booleano correspondiente a la verificacion de si el promedio de notas es mayor a 7, nota de primer parcial mayor o igual a 6 y nota de segundo parcial mayor o igual a 6, no recibe parametros, metodo de acceso privado*/
    private boolean aprueba(){
        if((promedio() > 7.0) && ((nota1 >= 6.0)&&(nota2 >= 6.0))) {
            return true;
        }else {
            return false;
        }
    }
    /**Retorna una cadena de caracteres (dato de tipo String) con las palabras "aprobado" o "desaprobado" segun corresponda, no recibe parametros, metodo de acceso privado*/
    private String leyendaAprueba(){
        if(aprueba()){
            return "APROBADO";
        }else {
            return "DESAPROBADO";
        }
    }
    /**Retorna el promedio de notas de un alumno (dato de tipo double), no recibe parametros, metodo de acceso publico*/
    public double promedio(){
            return ((this.getNota1() + this.getNota2())/2);
    }
    /**Retorna una cadena (String) con el formato "nombre apellido", no recibe parametros, metodo de acceso publico*/
    public String nomYApe(){
        return (this.getNombre() + " " + this.getApellido());
    }
    /**Retorna una cadena (String) con el formato "apellido nombre", no recibe parametros, metodo de acceso publico*/
    public String apeYNom(){
        return (this.getApellido() + " " + this.getNombre());
    }
    /**Muestra datos detallados del objeto de tipo Alumno, no recibe parametros, retorna void, metodo de acceso publico*/
    public void mostrar(){
        System.out.print("\nNombre y apellido: " +this.nomYApe()+ "\nLU: "+this.getLu() + "\tNotas: "+ this.getNota1()+ " - "+ this.getNota2() + "\nPromedio: " + promedio() + " - " + leyendaAprueba());
    }
}