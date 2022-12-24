package patrones_comportamiento.memento;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Usuario getMemento(){
        return new Usuario(this.getNombre(), this.getEdad());
    }

    public void restartMemento(Usuario usuario){
        this.setNombre(usuario.getNombre());
        this.setEdad(usuario.getEdad());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
