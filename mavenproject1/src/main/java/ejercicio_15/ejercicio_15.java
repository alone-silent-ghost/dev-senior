/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_15;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ejercicio_15 {
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Ingresa un numero: ");
            numero = scanner.nextDouble();
            if (numero > 0) {
                System.out.println("El numero " + numero + " es positivo.");
            } else if (numero < 0) {
                System.out.println("El numero " + numero + " es negativo.");
            }
        } while (numero != 0);

        System.out.println("Fin del programa.");
        scanner.close();
    }
}


