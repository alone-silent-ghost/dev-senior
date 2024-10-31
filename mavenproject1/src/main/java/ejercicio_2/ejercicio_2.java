/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

/**
 *
 * @author User
 */
  import java.util.Scanner;
public class ejercicio_2 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer numero: ");
        double num3 = scanner.nextDouble();

        double mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El numero mas grande es: " + mayor);

        scanner.close();
    }
}

