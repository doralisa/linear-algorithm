package ar.com.ada.online.second.exercisefour;

import java.sql.DataTruncation;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
	// Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo
        //utilizan. Considere que el cobro es con base en las horas que lo disponen y que las
        //fracciones de hora se toman como completas.

        System.out.println("Programa que calcula el cobro del estacionamiento");

        int hours;
        double hourPrice;
        double result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas: ");
        hours = keyboard.nextInt();

        System.out.print("Ingrese el costo de la hora: ");
        hourPrice = keyboard.nextDouble();

        result = hours * hourPrice;

        System.out.print("El cobro del servicio de estacionamiento es: " + result);

    }
}
