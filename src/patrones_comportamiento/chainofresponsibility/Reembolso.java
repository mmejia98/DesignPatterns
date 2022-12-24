package patrones_comportamiento.chainofresponsibility;

public class Reembolso implements IManejadorTransacciones{

    private IManejadorTransacciones next;

    @Override
    public void setNextManejador(IManejadorTransacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {
        if(transaccion.getTipoTransaccion() == TipoTransaccion.Reembolso){
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El nuevo balance despues de un reembolso es :" + cantidad);
        }else{
            System.out.println("Operacion no valida");
        }
    }
}
