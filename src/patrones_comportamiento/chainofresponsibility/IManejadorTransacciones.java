package patrones_comportamiento.chainofresponsibility;

public interface IManejadorTransacciones {
    void setNextManejador(IManejadorTransacciones next);
    void ejecutarTransaccion(Transaccion transaccion);
}
