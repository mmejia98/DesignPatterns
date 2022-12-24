package patrones_estructurales.virtualproxy;

public class ProxyServicio implements IServicio {

    private IServicio servicio; //Costoso
    private Usuario usuario;

    public ProxyServicio(Usuario usuario) {

        this.usuario = usuario;
    }

    @Override
    public void leer() {
        this.obtenerServicio().leer();
    }

    @Override
    public void escribir() {
        this.obtenerServicio().escribir();
    }

    @Override
    public void actualizar() {
        this.obtenerServicio().actualizar();
    }

    @Override
    public void eliminar() {
        this.obtenerServicio().eliminar();
    }

    private IServicio obtenerServicio(){
        if(this.servicio == null){
            this.servicio = new Servicio();//
        }
        return (Servicio) this.servicio;
    }
}
