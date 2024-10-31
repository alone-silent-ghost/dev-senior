/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_14;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ejercicio_14 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Ingresa un numero: ");
            numero = scanner.nextDouble();
            if (numero >= 0) {
                System.out.println("El cubo de " + numero + " es " + Math.pow(numero, 3));
            }
        } while (numero >= 0);

        scanner.close();
    }
}


