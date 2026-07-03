import java.util.Scanner;
public class Primer {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Porfavor introduzca el primer numero: ");
        double num1 = entrada.nextDouble();
        System.out.print("Porfavor introduzca el segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.print("Seleccione operacion-- +,-,x,/: ");
        String operacion = entrada.next();
        if (operacion.equals("x")) {
            System.out.print("La multiplicacion de los dos numeros da: " + (num1 * num2));
        } else if (operacion.equals("+")) {
            System.out.print("La suma de los dos numeros da: " + (num1 + num2));
        } else if (operacion.equals("-")) {
            System.out.print("La resta de los dos numeros da: " + (num1 - num2));
        } else if (operacion.equals("/")) {
            System.out.print("La division de los dos numeros da: " + (num1 / num2));
        } else {
            System.out.print("Has dado una operacion inexistente en la calculadora");
        }

        entrada.close();
    }
}