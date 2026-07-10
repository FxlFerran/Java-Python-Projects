import java.util.ArrayList;
import java.util.Scanner;

class Niño{
    private String nombre;
    private String edad;
    private String estado;

    public Niño(String nombre,String edad,String estado){
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }
    public String getname(){
        return nombre;
    }
    public String getage(){
        return edad;
    }
    public String getstate(){
        return estado;
    }
    public void setname(String newname){
        this.nombre = newname;
    }
    public void setage(String newage){
        this.edad = newage;
    }
    public void setstate(String newstate){
        this.estado = newstate;
    }
}

public class control {
    public static void main(String[] args){
        ArrayList<Niño> niños = new ArrayList<Niño>();
        Scanner entrada = new Scanner(System.in);
        String selec;
        boolean cont = true;
        while (cont){
            System.out.println("Elija una opcion: 1.Añadir registro de niño 2.mirar registro de los niños 3.Modificar registro 4.salir");
            selec = entrada.nextLine();
            if (selec.equals("1")){
                niños.add(add(entrada));
            } else if (selec.equals("2")){
                for (Niño x : niños){
                    System.out.println("Nombre: " + x.getname() + " Edad: " + x.getage() + " Estado: " + x.getstate());
                }
            } else if (selec.equals("3")){
                System.out.println("Elija el niño al que quieras cambiar su registro: ");
                for (Niño x : niños){
                    System.out.println(x.getname());
                }
                String niño = entrada.nextLine();
                for (Niño x : niños){
                    if (x.getname().equals(niño)){
                        System.out.println("Ahora cambie el estado del niño: ");
                        x.setstate(entrada.nextLine());
                    }
                }
            } else if (selec.equals("4")){
                System.out.println("Gracias por utilizar 'control kids'");
                cont = false;
            } else {
                System.out.println("Debes elegir una de las opciones:");
            }
        }
        entrada.close();
    }
    public static Niño add(Scanner entrada){
        System.out.println("Proporcione el nombre del niño:");
        String name = entrada.nextLine();
        System.out.println("Proporcione la edad del niño:");
        String age = entrada.nextLine();
        System.out.println("Proporcione el estado del niño:");
        String state = entrada.nextLine();
        return new Niño(name,age,state);
    }
}


