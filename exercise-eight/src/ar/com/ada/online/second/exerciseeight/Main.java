package ar.com.ada.online.second.exerciseeight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra
    en bicicleta, considerando que lleva una velocidad constante. Realice un diagrama de
    flujo y pseudocódigo que representen el algoritmo para tal fin */

        int time;
        int distance;
        int speed;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el valor de la velocidad (km/h): ");
        speed = keyboard.nextInt();

        System.out.print("Ingrese el valor de la distancia (km): ");
        distance = keyboard.nextInt();

        time = distance / speed;

        System.out.println("El tiempo que tarda en llegar es de: " + time +  " horas");
    }
}
