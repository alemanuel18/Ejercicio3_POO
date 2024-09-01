//  @ Ejercicio 3
//  @ File Name : Biblioteca.java
//  @ Date : 31/08/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//

import java.util.ArrayList;

public class Biblioteca {

    //Atributos
    private String nombre;
    private ArrayList<Usuario>usuarios=new ArrayList<>();
    private ArrayList<Libro>libros=new ArrayList<>();
    private ArrayList<Prestamo>prestamos=new ArrayList<>();

    //Constructor
    /**
     * 
     * @param nombre
     */
    public Biblioteca(String nombre){
        this.nombre=nombre;
    }

    //Constructor vacio
    /**
     * 
     */
    public Biblioteca(){

    }

    /**
     * 
     * @param usuario
     */
    public void agregarusuario(Usuario usuario){
        usuarios.add(usuario);
    }

    /**
     * 
     * @param libro
     */
    public void agregarlibro(Libro libro){
        libros.add(libro);
    }

    /**
     * 
     * @param prestamo
     */
    public void agregarprestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }

    /**
     * 
     * @return libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }
    /**
     * 
     * @return prstamos
     */
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
    /**
     * 
     * @return usuarios
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    /**
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    
}
