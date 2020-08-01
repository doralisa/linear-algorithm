import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa que suma 2 números dados");
        // defino las variables
        int firstNumber;
        int secondNumber;
        int result;

        // habilito los datos del usuario
        Scanner keyboard = new Scanner(System.in);

        // leo los datos del usuario
        System.out.print("Ingrese el primer número para el cálculo: ");
        firstNumber = keyboard.nextInt();

        System.out.print("Ingrese el segundo número para el cálculo: ");
        secondNumber = keyboard.nextInt();

        // realizo el proceso y lo guardo en la variable result
        result = firstNumber + secondNumber;

        // muestro el resultado por pantalla
        System.out.println("El resultado es: " + result);
    }
}
