//Esto es el menu donde al haber elegido una base de datos poder modificar y ver las cosas

import java.sql.Connection;
import java.util.Scanner;

public class Menu{    
    public static void menu(Connection cn, String sql,Scanner entrada,String nombre){
        String y = "";
        Integer colum = 0;
        while (!y.equals("5")){
            System.out.println("Estas dentro de: " + nombre.toUpperCase() + " Puedes: 1.Crear una tabla 2.Mirar las tablas existentes 3.Añadir informacion 4.Borrar Tabla 5.Volver");
            y = entrada.nextLine();
                if (y.equals("1")){
                    System.out.println("Da el nombre da la tabla que quieras crear: ");
                    sql = "CREATE TABLE " + entrada.nextLine() + " (id INT PRIMARY KEY AUTO_INCREMENT";
                    System.out.println("Antes de crearla di cuantas cosas le pondras ej: 3 = 3 cosas aparte de su ID que añades (su nombre)");
                    colum = entrada.nextInt();
                    entrada.nextLine();
                    for (Integer i = 0; i < colum; i++){
                        System.out.println("Dame el nombre del valor " + i);
                        sql += ", " + entrada.nextLine() + " VARCHAR(100)";
                    }
                    sql += ");";
                    Main.setSQL(cn, sql);

                } else if (y.equals("2")){
                    sql = "SHOW TABLES";
                    Main.getSQL(cn, sql);
                } else if (y.equals("3")){
                    
                } else if (y.equals("4")){
                    System.out.println("Escribe la tabla que quieras borrar de la lista: ");
                    sql = "SHOW TABLES";
                    Main.getSQL(cn, sql);
                    sql = "DROP TABLE " + entrada.nextLine();
                    Main.setSQL(cn, sql);
                } else if (y.equals("5")){
                    y = "5";
                    Main.limpiarPantalla();
                } else {
                    System.out.println("Debe elegir una opcion de las que hay porfavor");
                }            
        }
    }
}