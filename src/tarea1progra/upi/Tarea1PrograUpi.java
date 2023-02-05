/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1progra.upi;

import java.util.Scanner;

public class Tarea1PrograUpi {

    public static void main(String[] args) {
        menu();
    }

    public static void ciclowhile() {
        int x = 0;
        while (x <= 20) {
            if (x > 5 && x < 10) {
                System.out.println("valor " + x);
            }
            x = x + 1;
        }
    }

    public static void ciclodowhile() {
        Scanner leer = new Scanner(System.in);

        byte opcion = 0;
        do {
            System.out.println("1-Sumar");
            System.out.println("2-restar");
            System.out.println("3-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
        } while (opcion != 3);
    }

    public static void Condicionswitch() {
        Scanner leer = new Scanner(System.in);
        byte dia = 0;
        System.out.println("Digite el dia");
        dia = leer.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);

        byte opcion = 0;
        do {
            System.out.println("1-Sumar");
            System.out.println("2-restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;    
                default:
                    System.out.println("Opcion inválida");
                    break;
            }
        } while (opcion != 5);
    }

    public static void sumar() {
         Scanner leer = new Scanner(System.in);
          System.out.print("Ingrese el primer número: ");
           int num1 = leer.nextInt();
          System.out.print("Ingrese el segundo número: ");
          int num2 = leer.nextInt();

        int total = num1 + num2;

        System.out.println("Total de la suma: " + total);
    }

    public static void restar() {
         Scanner leer = new Scanner(System.in);
          System.out.print("Ingrese el primer número: ");
           int num1 = leer.nextInt();
          System.out.print("Ingrese el segundo número: ");
          int num2 = leer.nextInt();

        int total = num1 - num2;

        System.out.println("Total de la resta: " + total);
    }
    public static void multiplicar() {
         Scanner leer = new Scanner(System.in);
          System.out.print("Ingrese el primer número: ");
           int num1 = leer.nextInt();
          System.out.print("Ingrese el segundo número: ");
          int num2 = leer.nextInt();

        int total = num1 * num2;

        System.out.println("Total de la Multiplicación: " + total);
    }
    public static void dividir() {
         Scanner leer = new Scanner(System.in);
          System.out.print("Ingrese el primer número: ");
           int num1 = leer.nextInt();
          System.out.print("Ingrese el segundo número: ");
          int num2 = leer.nextInt();

        int total = num1 / num2;

        System.out.println("Total de la Division: " + total);
    }
public static void CondicionIf() {
    int num1, num2, num3;
    num1 = 6;
    num2 = 7;
    num3 = 9;
    
    // Condición IF ELSE ELSE FI
    if ((num1 > num2) && (num1 > num3)) {
        System.out.println(num1 + " es mayor que " + num2 + " y " + num3);
    } else if ((num2 > num1) && (num2 > num3)) {
        System.out.println(num2 + " es mayor que " + num1 + " y " + num3);
    } else if ((num3 > num1) && (num3 > num2)) {
        System.out.println(num3 + " es mayor que " + num1 + " y " + num2);
    } else if ((num1 == num2) && (num2 == num3)) {
        System.out.println("Los tres números son iguales.");
    }
}

}
