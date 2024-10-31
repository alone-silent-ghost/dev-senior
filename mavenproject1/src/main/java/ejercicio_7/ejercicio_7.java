/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_7;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ejercicio_7 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera longitud: ");
        double a = scanner.nextDouble();

        System.out.print("Ingresa la segunda longitud: ");
        double b = scanner.nextDouble();

        System.out.print("Ingresa la tercera longitud: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Las longitudes pueden formar un triangulo.");
        } else {
            System.out.println("Las longitudes no pueden formar un triangulo.");
        }

        scanner.close();
    }
}


