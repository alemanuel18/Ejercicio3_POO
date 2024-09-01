import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Usuario>usuarios=new ArrayList<>();
    private ArrayList<Libro>libros=new ArrayList<>();
    private ArrayList<Prestamo>prestamos=new ArrayList<>();

    public Biblioteca(String nombre){
        this.nombre=nombre;
    }

    public Biblioteca(){

    }

    public void agregarusuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void agregarlibro(Libro libro){
        libros.add(libro);
    }

    public void agregarprestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    public String getNombre() {
        return nombre;
    }
    
    
}
