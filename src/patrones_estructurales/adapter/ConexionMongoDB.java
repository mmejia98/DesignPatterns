package patrones_estructurales.adapter;

public class ConexionMongoDB implements IConexionNoSQL{
    @Override
    public void conexion() {
        System.out.println("Conexion con Mongo DB");
    }

    @Override
    public String executeSentence() {
        return "execute";
    }
}
