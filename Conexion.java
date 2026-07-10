import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "";
// Método para abrir la conexión
    public static Connection conectar() {
        Connection conexion = null;
        try {
            // Intentamos conectar usando las credenciales
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión exitosa a la base de datos!");
        } catch (SQLException e) {
            // Si algo falla (contraseña mal, servidor apagado...), captura el error
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}

