package patrones_estructurales.adapter;

public class AdaptadorDB implements IConexionSQL{
    private IConexionNoSQL noSQL;

    public AdaptadorDB(IConexionNoSQL noSQL){
        this.noSQL = noSQL;
    }
    @Override
    public void conexion() {
        this.noSQL.conexion();
    }

    @Override
    public String runQuery() {
        return this.noSQL.executeSentence();
    }
}
