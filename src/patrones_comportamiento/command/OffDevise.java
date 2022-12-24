package patrones_comportamiento.command;

public class OffDevise implements ICommand{
    private IDevise devise;

    public OffDevise(IDevise devise) {
        this.devise = devise;
    }

    @Override
    public void operacion() {
        this.devise.off();
    }
}
