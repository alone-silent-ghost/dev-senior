/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_12;

/**
 *
 * @author User
 */
  import java.util.Scanner;
public class ejercicio_12 {
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el peso de la sandia en kilogramos: ");
        int peso = scanner.nextInt();

        if (peso > 2 && peso % 2 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}


