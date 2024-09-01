//  @ Ejercicio 3
//  @ File Name : Usuario.java
//  @ Date : 31/08/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//

public class Usuario {

    //Atributos
    private String nombre, codigo;

    //Constructor
    /**
     * 
     * @param nombre String
     * @param codigo String
     */
    public Usuario(String nombre, String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }

    //Constructor vacio
    /**
     * 
     */
    public Usuario(){

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