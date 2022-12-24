package patrones_creacionales.abstractfactory;

public class SamsungStore implements IAbstractFactory{
    @Override
    public IComputadora crearComputadora() {
        return new QX410();
    }
    @Override
    public ITablet crearTablet() {
        return new TabS3();
    }
}
