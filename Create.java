//Aqui es la creacion de las bases de datos

import java.util.Scanner;

public class Create{    
    public static String create(Scanner entrada){
        System.out.println("Para crear una base de datos solo debes dar el nombre: ");
        String name = entrada.nextLine();
        return name;
    }
}