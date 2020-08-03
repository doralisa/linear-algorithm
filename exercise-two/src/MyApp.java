import java.util.Scanner;

public class MyApp {

    //Un estudiante realiza cuatro exámenes durante el semestre, los cuales tienen la misma ponderación. Realice el pseudocódigo y el diagrama de flujo que representen el algoritmo correspondiente para obtener el promedio de las calificaciones obtenidas.

    public static void main(String[] args) {
        System.out.println("Ponderación de calificaciones");
        // defino las variables
        int qualificationOne;
        int qualificationTwo;
        int qualificationThree;
        int qualificationFour;
        int sum;
        int average;

        // habiito los datos a ingresar
        Scanner keyboard = new Scanner(System.in);

        //leo los datos del usuario
        System.out.print("Ingrese calificación uno: ");
        qualificationOne = keyboard.nextInt();

        System.out.print("Ingrese calificación dos: ");
        qualificationTwo = keyboard.nextInt();

        System.out.print("Ingrese calificación tres: ");
        qualificationThree = keyboard.nextInt();

        System.out.print("Ingrese calificación cuatro: ");
        qualificationFour = keyboard.nextInt();

        // realizo el proceso y lo guardo en la variable average
        sum = qualificationOne + qualificationTwo + qualificationThree + qualificationFour;
        average = sum / 4;

        // muestro el resultado por pantalla
        System.out.println("El promedio es: " + average);








    }
}
