/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_23;

/**
 *
 * @author User
 */
   import java.util.Scanner;
public class ejercicio_23 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el tamano del diamante (entero positivo impar): ");
        int tamano = scanner.nextInt();

        if (tamano <= 0 || tamano % 2 == 0) {
            System.out.println("El tamano debe ser un número entero positivo impar.");
            return;
        }

        int mitad = tamano / 2;

       
        for (int i = 0; i <= mitad; i++) {
            for (int j = mitad; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = mitad - 1; i >= 0; i--) {
            for (int j = mitad; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
 

