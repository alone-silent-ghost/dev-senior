/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

/**
 *
 * @author User
 */
    import java.util.Scanner;
public class ejercicio_4 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una letra: ");
        char letra = scanner.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra " + letra + " es mayuscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra " + letra + " es minuscula.");
        } else {
            System.out.println("El caracter ingresado no es una letra.");
        }

        scanner.close();
    }
}


