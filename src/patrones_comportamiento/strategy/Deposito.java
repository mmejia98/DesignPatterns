package patrones_comportamiento.strategy;

public class Deposito implements IStrategy{
    @Override
    public float realizarOperacion(float balance, float cantidad) {
        return balance + cantidad;
    }
}
