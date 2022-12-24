package patrones_comportamiento.observer;

public class Usuario implements IObserver{
    @Override
    public void notificacion(String mensaje) {
        System.out.println(mensaje);
    }
}
