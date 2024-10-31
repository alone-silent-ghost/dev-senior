/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_21;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ejercicio_21 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa '1' para convertir Millas a Kilometros o '2' para convertir Kilometros a Millas: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingresa la cantidad de millas: ");
            double millas = scanner.nextDouble();
            double kilometros = millas * 1.60934;
            System.out.println(millas + " millas son " + kilometros + " kilometros.");
        } else if (opcion == 2) {
            System.out.print("Ingresa la cantidad de kilometros: ");
            double kilometros = scanner.nextDouble();
            double millas = kilometros * 0.621371;
            System.out.println(kilometros + " kilometros son " + millas + " millas.");
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}


