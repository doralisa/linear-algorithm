package ar.com.ada.online.second.exercisesix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Se requiere determinar la hipotenusa de un triángulo rectángulo. ¿Cómo sería el
diagrama de flujo y el pseudocódigo que representen el algoritmo para obtenerla?
Recuerde que por Pitágoras se tiene que: C2 = A2 + B2 .*/

        double hypotenuse;
        double legOne;
        double legTwo;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el valor del primer cateto: ");
        legOne = keyboard.nextDouble();

        System.out.print("Ingrese el valor del segundo cateto: ");
        legTwo = keyboard.nextDouble();

        hypotenuse = Math.sqrt( Math.pow(legOne, 2) + Math.pow(legTwo, 2) );

        System.out.println("El valor de la hipotenusa es: " + hypotenuse);
    }
}
