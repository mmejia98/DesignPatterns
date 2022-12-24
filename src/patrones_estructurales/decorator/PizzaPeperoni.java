package patrones_estructurales.decorator;

public class PizzaPeperoni implements IPizza{
    @Override
    public String descripcion() {
        return "Pizza peperoni";
    }

    @Override
    public float precio() {
        return 8;
    }
}
