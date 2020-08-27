package ar.com.ada.online.second.exercisefive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura.
    Considere que se cobra por m2 y realice un diagrama de flujo y pseudocódigo que
    representen el algoritmo que le permita ir generando presupuestos para cada cliente*/

        System.out.println("Programa para calcular cobro de servicio de pintura");
        double squareMeter;
        double costofService;
        double totaltoPay;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de metros cuadrados: ");
        squareMeter = keyboard.nextDouble();

        System.out.print("Ingrese el costo del servicio: ");
        costofService = keyboard.nextDouble();

        totaltoPay = costofService * squareMeter;

        System.out.println("El costo del servicio es: " + totaltoPay);

    }
}
