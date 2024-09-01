public class Prestamo {

    private String codigo;
    private Libro libro;
    private Usuario usuario;

    public Prestamo(String codigo, Libro libro, Usuario usuario){
        this.codigo=codigo;
        this.libro=libro;
        this.usuario=usuario;
    }

    public Prestamo(){
        
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Libro getLibro() {
        return libro;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Usuario getUsuario() {
        return usuario;
    }
        
}
