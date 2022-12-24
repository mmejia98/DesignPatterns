package patrones_comportamiento.state;

public class Auto implements IEstadoAuto{
    IEstadoAuto autoEncendido;
    IEstadoAuto autoManejar;
    IEstadoAuto autoApagar;
    IEstadoAuto estadoActual;
    public Auto(){
        this.autoEncendido = new AutoEncender(this);
        this.autoApagar = new AutoApagar(this);
        this.autoManejar = new AutoManejar(this);
        this.estadoActual = this.autoEncendido;
    }

    public IEstadoAuto getAutoEncendido() {
        return autoEncendido;
    }

    public void setAutoEncendido(IEstadoAuto autoEncendido) {
        this.autoEncendido = autoEncendido;
    }

    public IEstadoAuto getAutoManejar() {
        return autoManejar;
    }

    public void setAutoManejar(IEstadoAuto autoManejar) {
        this.autoManejar = autoManejar;
    }

    public IEstadoAuto getAutoApagar() {
        return autoApagar;
    }

    public void setAutoApagar(IEstadoAuto autoApagar) {
        this.autoApagar = autoApagar;
    }

    public IEstadoAuto getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(IEstadoAuto estadoActual) {
        this.estadoActual = estadoActual;
    }

    @Override
    public void encender() {
        this.estadoActual.encender();
    }

    @Override
    public void manejar() {
        this.estadoActual.manejar();
    }

    @Override
    public void apagar() {
        this.estadoActual.apagar();
    }
}
