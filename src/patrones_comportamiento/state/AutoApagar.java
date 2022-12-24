package patrones_comportamiento.state;

public class AutoApagar implements IEstadoAuto{
    private final Auto auto;

    public AutoApagar(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void encender() {
        System.out.println("El auto ya esta encendido");
        auto.setEstadoActual(auto.getAutoEncendido());
    }

    @Override
    public void manejar() {
        System.out.println("El auto ya esta en movimiento");
    }

    @Override
    public void apagar() {
        System.out.println("El auto ya esta apagado");
    }
}
