import java.util.Scanner;
public class calculadora {
    public static void main(String[] args){
        Scanner entrar = new Scanner(System.in);
        boolean calcular = true;
        while (calcular) {
            System.out.println("Quieres utilizar la calculadora? 1(si)/2(no) ");
            String elec = entrar.next();
            if (elec.equals("1")) {
                System.out.println("Ahora elija por favor su primer numero de esta operacion: ");
                double num1 = entrar.nextDouble();
                System.out.println("Ahora elija por favor su segundo numero de esta operacion: ");
                double num2 = entrar.nextDouble();
                System.out.println("Ahora porfavor diga su operacion: +, -, x, / ");
                String oper = entrar.next();
                if (oper.equals("x")){
                    mult(num1,num2);
                } else if (oper.equals("-")){
                    rest(num1,num2);
                } else if (oper.equals("+")){
                    suma(num1,num2);
                } else if (oper.equals("/")){
                    divi(num1,num2);
                } else {System.out.println("No has seleccionado ninguna de las operaciones posibles");}
            }
            else {
                System.out.println("Al elejir no (o cualquier otra cosa) la calculadora se cierra");
                calcular = false;
            }
        }
        entrar.close();
    }   
    public static void mult(double num1, double num2){
        double resultado = num1 * num2;
        System.out.println("El resultado de tu multiplicacion es este: " + resultado);
    }
    public static void rest(double num1, double num2){
        double resultado = num1 - num2;
        System.out.println("El resultado de tu resta es este: " + resultado);
    }
    public static void suma(double num1, double num2){
        double resultado = num1 + num2;
        System.out.println("El resultado de tu suma es este: " + resultado);
    }
    public static void divi(double num1, double num2){
        double resultado = num1 / num2;
        System.out.println("El resultado de tu division es este: " + resultado);
    }
}
