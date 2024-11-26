package Grupo4SC303MNProyectoClienteServidor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public class DatabaseConnection {
        private static final String URL = "jdbc:mysql://localhost:3306/tu_base_de_datos";
        private static final String USER = "root";
        private static final String PASSWORD = "12A34cdc";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);


        }
    }
}