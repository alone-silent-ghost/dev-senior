/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_8;

/**
 *
 * @author User
 */
   import java.util.Scanner;
public class ejercicio_8 {
 


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de anios: ");
        int edad = scanner.nextInt();
        String etapa;

        if (edad >= 0 && edad <= 5) {
            etapa = "Primera infancia";
        } else if (edad >= 6 && edad <= 11) {
            etapa = "Infancia";
        } else if (edad >= 12 && edad <= 18) {
            etapa = "Adolescencia";
        } else if (edad >= 19 && edad <= 26) {
            etapa = "Juventud";
        } else if (edad >= 27 && edad <= 59) {
            etapa = "Adultez";
        } else if (edad > 59) {
            etapa = "Persona mayor";
        } else {
            etapa = "Edad no válida";
        }

        System.out.println("La etapa de vida es: " + etapa);

        scanner.close();
    }
}


