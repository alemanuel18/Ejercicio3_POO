import java.util.ArrayList;

public class Funcionamiento {
    private ArrayList<Biblioteca>bibliotecas=new ArrayList<>();
    int contador=0;

    public Libro creaLibro(String nombre, String codigo, String genero){
        Libro nuevoLibro= new Libro(nombre, codigo, genero);
        return nuevoLibro;
    }

    public Usuario creaUsuario(String nombre, String codigo){
        Usuario nuevoUsuario= new Usuario(nombre, codigo);
        return nuevoUsuario;
    }

    public Prestamo crearPrestamo(String codigo, Libro libro, Usuario usuario){
        Prestamo nuevoPrestamo=new Prestamo(codigo, libro, usuario);
        return nuevoPrestamo;
    }

    public Biblioteca crearAgregarBiblioteca(String nombre){
        Biblioteca nuevaBiblioteca=new Biblioteca(nombre);
        bibliotecas.add(nuevaBiblioteca);
        return nuevaBiblioteca;
    }

    public String codigoPrestamo(String fecha){
        String codigoBoleto=fecha+contador;
        contador++;
        return codigoBoleto;
    }

    public void agregarLibroBiblioteca(String nombre, Libro libro){
        for(Biblioteca biblioteca :bibliotecas){
            if (biblioteca.getNombre().equals(nombre)) {
                biblioteca.agregarlibro(libro);
            }
        }
    }

    public void agregarUsuarioBiblioteca(String nombre, Usuario usuario){
        for(Biblioteca biblioteca:bibliotecas){
            if (biblioteca.getNombre().equals(nombre)) {
                biblioteca.agregarusuario(usuario);
            }
        }
    }

    public void agregarPrestamoBiblioteca(String nombre, Prestamo prestamo){
        for(Biblioteca biblioteca:bibliotecas){
            if ((biblioteca.getNombre().equals(nombre))) {
                biblioteca.agregarprestamo(prestamo);
            }
        }
    }

    public ArrayList<Biblioteca> getBibliotecas() {
        return bibliotecas;
    }
    public void setBibliotecas(ArrayList<Biblioteca> bibliotecas) {
        this.bibliotecas = bibliotecas;
    }
}
