import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String x = "";
        String sql = "";
        Scanner entrada = new Scanner(System.in);
        // 1. Recibimos la conexión (el puente)
        Connection cn = Conexion.conectar();
        limpiarPantalla();
        if (cn != null) {
            while (!x.equals("5")){
                System.out.println("Bienvenido a Acompañame, aqui puedes ver los registros de los niños, sus estados de animo y otros");
                System.out.println("Acciones posibles: 1.Crear base de datos 2.Mirar base de datos 3.Elegir base de datos 4.Borrar base de datos 5.Salir");
                x = entrada.nextLine();
                if (x.equals("1")){
                    sql = "CREATE DATABASE " + Create.create(entrada);
                    setSQL(cn, sql);
                } else if (x.equals("2")){
                    sql = "SHOW DATABASES";
                    getSQL(cn, sql);
                } else if (x.equals("3")){
                    sql = "SHOW DATABASES";
                    getSQL(cn, sql);
                    String nombre = entrada.nextLine();
                    sql = "USE " + nombre;
                    setSQL(cn, sql);
                    limpiarPantalla();
                    Menu.menu(cn, sql, entrada, nombre);
                } else if (x.equals("4")){
                    System.out.println("De el nombre de la base de datos que quiere borrar: ");
                    sql = "SHOW DATABASES";
                    getSQL(cn, sql);
                    sql = "DROP DATABASE " + entrada.nextLine();
                    setSQL(cn, sql);
                } else if (x.equals("5")){
                    x = "5";
                } else {
                    System.out.println("Debe elegir una opcion de las que hay porfavor");
                }
            }
        }
        entrada.close();
    }
    public static void setSQL(Connection cn, String sql){
        try {Statement st = cn.createStatement();
                st.executeUpdate(sql);
            } catch (SQLException e){
                System.out.println("Ha habido un error: " + e);
            }
    }
    public static void getSQL(Connection cn, String sql){
        try {Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    System.out.println(rs.getString(1));
                }
            } catch (SQLException e){
                System.out.println("Ha habido un error: " + e);
            }
    }
    public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Si falla (por ejemplo dentro del entorno de ejecución de un IDE), 
            // imprime líneas en blanco para simular la limpieza
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }
}


