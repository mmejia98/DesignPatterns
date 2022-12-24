package patrones_comportamiento.state;

public class AutoEncender implements IEstadoAuto{
    private final Auto auto;

    public AutoEncender(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void encender() {
        System.out.println("El auto ya esta encendido");
    }

    @Override
    public void manejar() {
        System.out.println("El auto ya esta en movimiento");
        auto.setEstadoActual(auto.getAutoManejar());
    }

    @Override
    public void apagar() {
        System.out.println("El auto ya esta apagado");
        auto.setEstadoActual(auto.getAutoApagar());
    }
}
