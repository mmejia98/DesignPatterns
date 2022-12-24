package patrones_creacionales.builder;

public class Usuario {
    private String nombre;
    private  String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private boolean medioContacto; //Opcional

    //String metodoPago //<- Si y solo los tres attr tienen valores (email, telefono, direccion)
    //String token //<- Igualmente como el metodoPago

    private String metodoPago;
    private String token;

    public boolean isMedioContacto() {
        return medioContacto;
    }

    public BuilderUsuario setMedioContacto(boolean medioContacto) {
        if(!medioContacto){
            throw new IllegalArgumentException("No es posible asignar un valor falso a medio de contacto");
        }
        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);
    }

    public Usuario setMetodoPago(String metodoPago){
        if(this.direccion == null || this.email == null || this.telefono == null){
            throw new IllegalArgumentException("Debe ingresar todos los datos de email, direccion y telefono para establecer metodo de pago");
        }
        this.metodoPago = metodoPago;
        return this;
    }

    public Usuario setToken(String token){
        if(this.direccion.equals("") || this.direccion == null || this.email.equals("") || this.email == null || this.telefono.equals("") || this.telefono == null){
            throw new IllegalArgumentException("Debe ingresar todos los datos de email, direccion y telefono para establecer un token");
        }
        this.token = token;
        return this;
    }

    private Usuario(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.medioContacto = false;
    }

    public static Usuario make(String nombre, String apellido){
        return new Usuario(nombre, apellido);
    }

    public Usuario build(){
        return this;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", metodo_pago='" + metodoPago + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public static class BuilderUsuario{
        private Usuario usuario;

        public BuilderUsuario(Usuario usuario){
            this.usuario = usuario;
        }

        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }

        public BuilderUsuario setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
        }
        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        public Usuario build(){
            return this.usuario;
        }

    }
}
