package ar.com.ada.online.second.exerciseseven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* La compañía de autobuses “La curva loca” requiere determinar el costo que tendrá el
    boleto de un viaje sencillo, esto basado en los kilómetros por recorrer y en el costo por
    kilómetro. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo
    para tal fin.*/

        double kilometres;
        double costPerKilometres;
        double costOfTicket;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de kilometros: ");
        kilometres = keyboard.nextDouble();

        System.out.print("Ingrese el costo por kilometro: ");
        costPerKilometres = keyboard.nextDouble();

        costOfTicket = kilometres * costPerKilometres;

        System.out.print("El costo del boleto es: " + costOfTicket);
    }
}
