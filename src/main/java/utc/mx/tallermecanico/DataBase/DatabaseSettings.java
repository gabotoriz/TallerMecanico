package utc.mx.tallermecanico.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseSettings {
    private DatabaseSettings() {
    }

    private static DatabaseSettings instance;

    DatabaseVariables db = new DatabaseVariables();

    private static final String Driver = "com.mysql.cj.jdbc.Driver";

    //PARA ESTBLECER LA CONEXION
    public Connection getConnection() {
        try {
            Class.forName(Driver);
            return DriverManager.getConnection(db.getDriver(), db.getUser(), db.getPassword());
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //PARA CERRAR LA CONEXION
    public void dropConnection() throws SQLException {
        Connection connection = getConnection();
        try {
            connection.close();
        } catch (SQLException e) {
            connection.close();

        }
    }

    //SINGLETON
    public DatabaseSettings getInstance() {
        if (instance == null) {
            instance = new DatabaseSettings();
        }
        return instance;
    }

}
