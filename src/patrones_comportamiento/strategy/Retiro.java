package patrones_comportamiento.strategy;

public class Retiro implements IStrategy{
    @Override
    public float realizarOperacion(float balance, float cantidad) {
        return balance - cantidad;
    }
}
