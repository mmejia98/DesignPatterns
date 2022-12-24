package patrones_creacionales.simplefactory;

public class Pizzeria {
    //Para DB, API etc.
    public Pizza crearPizzaChica(){
        return new Pizza(6);
    }

    public Pizza crearPizzaMediana(){
        return new Pizza(8);
    }

    public Pizza crearPizzaGrande(){
        return new Pizza(12);
    }
}
