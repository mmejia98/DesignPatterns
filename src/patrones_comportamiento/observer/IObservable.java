package patrones_comportamiento.observer;

public interface IObservable {
    void addOnserver(IObserver o);
    void notificarObservadores();
    void removerObserver();

}
