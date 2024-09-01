//  @ Ejercicio 3
//  @ File Name : Funcionamiento.java
//  @ Date : 31/08/2024
//  @ Author : Alejandro Manuel Jerez Melgar 24678
//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Funcionamiento {
    //Atributos
    private ArrayList<Biblioteca>bibliotecas=new ArrayList<>();
    int contador=0;

    /**
     * 
     * @param nombre
     * @param codigo
     * @param genero
     * @return
     */
    public Libro creaLibro(String nombre, String codigo, String genero){
        Libro nuevoLibro= new Libro(nombre, codigo, genero);
        return nuevoLibro;
    }

    /**
     * 
     * @param nombre
     * @param codigo
     * @return
     */
    public Usuario creaUsuario(String nombre, String codigo){
        Usuario nuevoUsuario= new Usuario(nombre, codigo);
        return nuevoUsuario;
    }

    /**
     * 
     * @param codigo
     * @param libro
     * @param usuario
     * @return
     */
    public Prestamo crearPrestamo(String codigo, Libro libro, Usuario usuario){
        Prestamo nuevoPrestamo=new Prestamo(codigo, libro, usuario);
        return nuevoPrestamo;
    }

    /**
     * 
     * @param nombre
     * @return
     */
    public Biblioteca crearAgregarBiblioteca(String nombre){
        Biblioteca nuevaBiblioteca=new Biblioteca(nombre);
        bibliotecas.add(nuevaBiblioteca);
        return nuevaBiblioteca;
    }

    /**
     * 
     * @param fecha
     * @return
     */
    public String codigoPrestamo(String fecha){
        String codigoBoleto=fecha+contador;
        contador++;
        return codigoBoleto;
    }

    /**
     * 
     * @param nombre
     * @param libro
     */
    public void agregarLibroBiblioteca(String nombre, Libro libro){
        for(Biblioteca biblioteca :bibliotecas){
            if (biblioteca.getNombre().equals(nombre)) {
                biblioteca.agregarlibro(libro);
            }
        }
    }

    /**
     * 
     * @param nombre
     * @param usuario
     */
    public void agregarUsuarioBiblioteca(String nombre, Usuario usuario){
        for(Biblioteca biblioteca:bibliotecas){
            if (biblioteca.getNombre().equals(nombre)) {
                biblioteca.agregarusuario(usuario);
            }
        }
    }

    /**
     * 
     * @param nombre
     * @param prestamo
     */
    public void agregarPrestamoBiblioteca(String nombre, Prestamo prestamo){
        for(Biblioteca biblioteca:bibliotecas){
            if ((biblioteca.getNombre().equals(nombre))) {
                biblioteca.agregarprestamo(prestamo);
            }
        }
    }

    /**
     * 
     * @return Estadisticas
     */
    public String mostrarEstadisticas() {
        int totalLibrosPrestados = 0;
        Map<String, Integer> generoContador = new HashMap<>();
        Map<String, Integer> libroContador = new HashMap<>();
        
        for (Biblioteca biblioteca : bibliotecas) {
            for (Prestamo prestamo : biblioteca.getPrestamos()) {
                totalLibrosPrestados++;

                // Contar géneros
                String genero = prestamo.getLibro().getGenero();
                generoContador.put(genero, generoContador.getOrDefault(genero, 0) + 1);

                // Contar libros
                String nombreLibro = prestamo.getLibro().getNombre();
                libroContador.put(nombreLibro, libroContador.getOrDefault(nombreLibro, 0) + 1);
            }
        }

        // Determinar el género más solicitado
        String generoMasSolicitado = "";
        int maxGenero = 0;
        for (Map.Entry<String, Integer> entry : generoContador.entrySet()) {
            if (entry.getValue() > maxGenero) {
                maxGenero = entry.getValue();
                generoMasSolicitado = entry.getKey();
            }
        }

        // Determinar el libro más prestado
        String libroMasPrestado = "";
        int maxLibro = 0;
        for (Map.Entry<String, Integer> entry : libroContador.entrySet()) {
            if (entry.getValue() > maxLibro) {
                maxLibro = entry.getValue();
                libroMasPrestado = entry.getKey();
            }
        }

        // Construir la cadena de resultado
        String resultado = "Total de libros prestados: " + totalLibrosPrestados + "\nGénero más solicitado: " + generoMasSolicitado + "\nLibro más prestado: " + libroMasPrestado;

        return resultado;
    }

    /**
     * 
     * @return bibliotecas
     */
    public ArrayList<Biblioteca> getBibliotecas() {
        return bibliotecas;
    }
}
