public class Libro {
    private String nombre, codigo, genero;

    public Libro(String nombre, String codigo, String genero){
        this.nombre=nombre;
        this.codigo=codigo;
        this.genero=genero;
    }

    public Libro(){

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    
}
