import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class GestorBiblioteca {

    public static void main(String[] args) {

       
        String nombreB="";
        String nombreL="";
        

        Funcionamiento funcionamiento=new Funcionamiento();
       
        Biblioteca biblioteca= new Biblioteca();

        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("MMyyyydd");
        String fecha = formateador.format(fechaActual);
        String codigo;

        int eleccion=menu();

        Scanner teclado=new Scanner(System.in);

        while (eleccion!=6) {
            if (eleccion == 1) {
                System.out.println("Ingrese el nombre de la biblioteca");
                nombreB=teclado.nextLine();
                funcionamiento.crearAgregarBiblioteca(nombreB);
                System.out.println("Se a creado la biblioteca");
                eleccion = menu();
            }else if (eleccion==2) {
                if (funcionamiento.getBibliotecas().isEmpty()) {
                    System.out.println("Debe existir almenos una biblioteca para agregar un libro.");
                }else{
                    nombreB=seleccionarBibliotecaA(funcionamiento);
                    System.out.println("Ingrese el nombre del libro");
                    nombreL=teclado.nextLine();
                    funcionamiento.agregarLibroBiblioteca(nombreB, funcionamiento.creaLibro(nombreL, code(), menu2()));
                    System.out.println("Se a creado el libro");
                }
                eleccion=menu();
            }else if (eleccion==3) {
                if (funcionamiento.getBibliotecas().isEmpty()) {
                    System.out.println("Debe existir almenos una biblioteca para agregar un usuario.");
                }else{
                    nombreB=seleccionarBibliotecaA(funcionamiento);
                    System.out.println("Ingrese el nombre del usuario");
                    nombreL=teclado.nextLine();
                    funcionamiento.agregarUsuarioBiblioteca(nombreB, funcionamiento.creaUsuario(nombreL, code()));
                    System.out.println("Se a creado el usuario");
                }
                eleccion=menu();
            }else if (eleccion==4) {
                if (funcionamiento.getBibliotecas().isEmpty()) {
                    System.out.println("Debe existir almenos una biblioteca para agregar un prestamo");
                }else{
                    biblioteca= seleccionarBibliotecaB(funcionamiento);
                    if (biblioteca.getLibros().isEmpty() && biblioteca.getUsuarios().isEmpty()) {
                        System.out.println("Esta biblioteca no tiene libros o usuarios registrados");
                    }else{
                        nombreB=biblioteca.getNombre();
                        funcionamiento.agregarPrestamoBiblioteca(nombreB, funcionamiento.crearPrestamo(funcionamiento.codigoPrestamo(fecha), seleccionarLibro(biblioteca, funcionamiento), seleccionarUsuario(biblioteca, funcionamiento)));
                        System.out.println("Se a registrado el prestamo");
                    }
                }
                eleccion=menu();
            }else if (eleccion==5) {
                funcionamiento.mostrarEstadisticas();
                eleccion=menu();
            }
            
        }
        System.out.println("Gracias por preferirnos, hasta la proxima.");
    }

    public static int menu(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nMenu\nSeleccion lo que deses realizar\n1. Crear nueva biblioteca\n2. Agregar libro a una biblioteca\n3. Agregar usuario a una biblioteca\n4. Crear un prestamo en una biblioteca\n5. Generar estadisticas\n6. Salir");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>6){
                    System.out.println("Ingrese una de las opciones del menu");
                }else
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioi;

    }

    public static String menu2(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            //menu de estado de la tarea 
            System.out.println("\nSeleccion el genero del libro\n1. Fantacia\n2. Misterio\n3. Terror");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>3){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        eleccionUsuarioS="Fantacia";
                        verificador=true;
                    }
                    else if (eleccionUsuarioi==2) {
                        eleccionUsuarioS="Mistario";
                        verificador=true;
                    }
                    else if (eleccionUsuarioi==3) {
                        eleccionUsuarioS="Terror";
                        verificador=true;
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;

    }

    public static String code(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nIngrese el codigo");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese el codigo");
            } 
        }
        return eleccionUsuarioS;

    }

    public static void mostrarBibliotecas(Funcionamiento funcionamiento) {
        ArrayList<Biblioteca> bibliotecas = funcionamiento.getBibliotecas();
        for (int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca biblioteca = bibliotecas.get(i);
            System.out.println((i + 1) + ". " + biblioteca.getNombre());
        }
    }

    public static String seleccionarBibliotecaA(Funcionamiento funcionamiento) {
        Scanner teclado=new Scanner(System.in);
        

        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        ArrayList<Biblioteca> bibliotecas = funcionamiento.getBibliotecas();

        
        while (verificador==false) {
            System.out.println("\nSeleccione el número de la biblioteca\n");
            mostrarBibliotecas(funcionamiento);
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi < 1 && eleccionUsuarioi > bibliotecas.size()){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    verificador=true;
                    eleccionUsuarioS= bibliotecas.get(eleccionUsuarioi-1).getNombre();
                }           
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;
    }

    public static Biblioteca seleccionarBibliotecaB(Funcionamiento funcionamiento) {
        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        Biblioteca biblioteca= new Biblioteca();
        ArrayList<Biblioteca> bibliotecas = funcionamiento.getBibliotecas();

        
        while (verificador==false) {
            System.out.println("\nSeleccione el número de la biblioteca\n");
            mostrarBibliotecas(funcionamiento);
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi < 1 && eleccionUsuarioi > bibliotecas.size()){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    verificador=true;
                    biblioteca= bibliotecas.get(eleccionUsuarioi-1);
                }           
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return biblioteca;
    }

    public static void mostrarLibros(Biblioteca biblioteca) {
        ArrayList<Libro> libros = biblioteca.getLibros();
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            System.out.println((i + 1) + ". " + libro.getNombre() + " - " + libro.getCodigo() + " - " + libro.getGenero());
        }
    }
    
    public static Libro seleccionarLibro(Biblioteca biblioteca, Funcionamiento funcionamiento){
        // Leer la selección del usuario
        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        Libro libro= new Libro();
        ArrayList<Libro> libros = biblioteca.getLibros();
        while (verificador==false) {
            System.out.println("\nSeleccione el número del libro\n");
            mostrarLibros(biblioteca);
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi < 1 && eleccionUsuarioi > libros.size()){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    verificador=true;
                    libro= libros.get(eleccionUsuarioi-1);
                }           
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return libro;
    }

    public static void mostrarUsuarios(Biblioteca biblioteca) {
        ArrayList<Usuario> usuarios = biblioteca.getUsuarios();
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            System.out.println((i + 1) + ". " + usuario.getNombre() + " - " + usuario.getCodigo());
        }
    }
    
    public static Usuario seleccionarUsuario(Biblioteca biblioteca, Funcionamiento funcionamiento){
        // Leer la selección del usuario
        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        Usuario usuario= new Usuario();
        ArrayList<Usuario> usuarios = biblioteca.getUsuarios();
        while (verificador==false) {
            System.out.println("\nSeleccione el número del usuario\n");
            mostrarLibros(biblioteca);
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi < 1 && eleccionUsuarioi > usuarios.size()){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    verificador=true;
                    usuario= usuarios.get(eleccionUsuarioi-1);
                }           
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return usuario;
    }

}