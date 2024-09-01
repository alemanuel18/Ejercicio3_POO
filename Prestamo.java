//  @ Ejercicio 3
//  @ File Name : Prestamo.java
//  @ Date : 31/08/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//

public class Prestamo {

    //Atributos
    private String codigo;
    private Libro libro;
    private Usuario usuario;

    //COnstructor
    /**
     * 
     * @param codigo String
     * @param libro Libro
     * @param usuario Usuario
     */
    public Prestamo(String codigo, Libro libro, Usuario usuario){
        this.codigo=codigo;
        this.libro=libro;
        this.usuario=usuario;
    }

    //Constructor vacio
    /**
     * 
     */
    public Prestamo(){
        
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
     * @param libro
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    /**
     * 
     * @return libro
     */
    public Libro getLibro() {
        return libro;
    }
    /**
     * 
     * @param usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    /**
     * 
     * @return usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }
        
}
