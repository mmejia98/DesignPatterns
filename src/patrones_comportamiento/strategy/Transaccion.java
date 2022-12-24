package patrones_comportamiento.strategy;

public class Transaccion {
    private IStrategy estrategia;//algoritmo

    public Transaccion(IStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public float ejecutarTransaccion(float balance, float cantidad){
        return this.estrategia.realizarOperacion(balance, cantidad);
    }
}
