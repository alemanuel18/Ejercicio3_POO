public class Usuario {

    private String nombre, codigo;

    public Usuario(String nombre, String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }
    public Usuario(){

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
}