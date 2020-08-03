package ar.com.ada.online.second.exercisethree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calcular el area de un rectangulo");
        int base, heigth, area;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        base = keyboard.nextInt();

        System.out.print("Ingrese la altura del rectangulo: ");
        heigth = keyboard.nextInt();

        area = base * heigth;

        System.out.println("El area del rectangulo es: " + area);

    }
}
