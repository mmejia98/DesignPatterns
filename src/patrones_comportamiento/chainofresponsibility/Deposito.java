package patrones_comportamiento.chainofresponsibility;

public class Deposito implements IManejadorTransacciones{

    private IManejadorTransacciones next;

    @Override
    public void setNextManejador(IManejadorTransacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {
        if(transaccion.getTipoTransaccion() == TipoTransaccion.Deposito){
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El nuevo balance despues de un deposito es :" + cantidad);
        }else{
            this.next.ejecutarTransaccion(transaccion);
        }
    }
}
