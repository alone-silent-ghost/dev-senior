/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

/**
 *
 * @author User
 */
  import java.util.Scanner;
public class ejercicio_6 {
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 && numero % 7 == 0) {
            System.out.println("El numero " + numero + " es divisible por 2 y por 7.");
        } else {
            System.out.println("El numero " + numero + " no es divisible por 2 y por 7.");
        }

        scanner.close();
    }
}


