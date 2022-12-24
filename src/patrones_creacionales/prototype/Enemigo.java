package patrones_creacionales.prototype;

public class Enemigo {
    private String imagen;
    private int posX;
    private int PosY;
    private int cantidadVida;

    public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
        this.imagen = imagen;
        this.posX = posX;
        PosY = posY;
        this.cantidadVida = cantidadVida;
    }

    public Enemigo(Enemigo enemigo){
        this.setImagen(enemigo.getImagen());
        this.setCantidadVida(enemigo.getCantidadVida());
        this.setPosX(enemigo.getPosX());
        this.setPosY(enemigo.getPosY());
    }

    public Enemigo clone(){
        //return new Enemigo(this);
        return new Enemigo(this.imagen, this.posX, this.PosY, this.cantidadVida);
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return PosY;
    }

    public void setPosY(int posY) {
        PosY = posY;
    }

    public int getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }
}
