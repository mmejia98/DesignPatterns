package patrones_creacionales.abstractfactory;

public interface IAbstractFactory {
    IComputadora crearComputadora();
    ITablet crearTablet();
}
