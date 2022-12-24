package patrones_comportamiento.templatemethod;

public abstract class Usuario {
    public void autenticacion(){
        System.out.println("Todos los usuarios necesitan autenticarse");
    }

    abstract void formaTrabajar();
}
