package patrones_comportamiento.visitor;

public class Lavadora implements ILineaBlanca, IVisitable{
    @Override
    public float getPrecio() {
        return 20f;
    }

    @Override
    public float aplicarDescuento(IVisitor visitor) {
        return visitor.visit(this);
    }
}
