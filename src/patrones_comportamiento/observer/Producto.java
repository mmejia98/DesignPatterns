package patrones_comportamiento.observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Producto implements IObservable{
    private Set<IObserver> observadores;
    private int stock;

    public Producto(int stock) {
        this.stock = stock;
        this.observadores = new LinkedHashSet<>();
    }

    public void venta(){
        this.setStock(this.stock - 1);
        System.out.println("Producto vendido");
        this.notificarObservadores();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void addOnserver(IObserver o) {
        this.observadores.add(o);
    }

    @Override
    public void notificarObservadores() {
        for (IObserver observador : this.observadores){
            observador.notificacion("El producto se vendio");
        }
    }

    @Override
    public void removerObserver() {

    }
}
