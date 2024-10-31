/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ejercicio_5 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una letra: ");
        char letra = scanner.next().charAt(0);

        letra = Character.toLowerCase(letra); // Convertir la letra a minúscula para simplificar la verificación

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La letra " + letra + " es una vocal.");
        } else if (Character.isLetter(letra)) {
            System.out.println("La letra " + letra + " es una consonante.");
        } else {
            System.out.println("El caracter ingresado no es una letra.");
        }

        scanner.close();
    }
}


