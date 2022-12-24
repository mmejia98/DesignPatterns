package patrones_comportamiento.command;

public class OnDevise implements ICommand{
    private IDevise devise;

    public OnDevise(IDevise devise) {
        this.devise = devise;
    }

    @Override
    public void operacion() {
        this.devise.on();
    }
}
