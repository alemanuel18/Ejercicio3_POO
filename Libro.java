//  @ Ejercicio 3
//  @ File Name : Libro.java
//  @ Date : 31/08/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//

public class Libro {
    //Atributos
    private String nombre, codigo, genero;

    //Constructor
    /**
     * 
     * @param nombre String
     * @param codigo String
     * @param genero String
     */
    public Libro(String nombre, String codigo, String genero){
        this.nombre=nombre;
        this.codigo=codigo;
        this.genero=genero;
    }

    //Constructor vacio
    /**
     * 
     */
    public Libro(){

    }

    /**
     * 
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * 
     * @return codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * 
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * 
     * @return genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    
}
