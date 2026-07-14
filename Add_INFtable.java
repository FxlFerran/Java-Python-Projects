import java.sql.Connection;
import java.util.Scanner;

public class Add_INFtable {
    public static void add_inftable(Connection cn, String sql, String tabla, Scanner entrada){
        Main.limpiarPantalla();
        String z = "";
        while (!z.equals("5")){
            System.out.println("Estas dentro de la tabla: " + tabla.toUpperCase() + " Aqui puede editar la informacion ver las columnas y otros");
            System.out.println("1.Mirar las columnas 2.Añadir informacion 3.Cambiar informacion 4.eliminar columna 5.volver");
            z = entrada.nextLine();
            if (z.equals("1")){
                sql = "DESCRIBE " + tabla;
                Main.getSQL(cn, sql);
            } else if (z.equals("2")){

            } else if (z.equals("3")){

            } else if (z.equals("4")){

            } else if (z.equals("5")){
                z = "5";
                Main.limpiarPantalla();
            } else {
                System.out.println("Debe elegir una opcion de las que hay porfavor");
            }  
        }
    }
}
