package patrones_creacionales.singleton;

public class ConexionDB {
    private static ConexionDB conexion;
    public String host;
    private ConexionDB(){

    }

    public synchronized static ConexionDB getInstance(){
        if(conexion == null){//No se a instanciado
            conexion = new ConexionDB();
        }
        return conexion;
    }
}
