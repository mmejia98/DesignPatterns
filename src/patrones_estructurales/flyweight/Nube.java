package patrones_estructurales.flyweight;

public class Nube {
    private TipoNube tipo;
    private String imagen;
    private int posX;
    private int posY;

    public Nube(TipoNube tipo, String imagen, int posX, int posY) {
        this.tipo = tipo;
        this.imagen = imagen;
        this.posX = posX;
        this.posY = posY;
    }

    public String getImagen(){
        return imagen;
    }
}
