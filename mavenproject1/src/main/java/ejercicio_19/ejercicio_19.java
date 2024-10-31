/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_19;

/**
 *
 * @author User
 */
 import java.util.Scanner;
public class ejercicio_19 {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("El número debe ser mayor que 0.");
        } else {
            int a = 0, b = 1;
            System.out.print("Los primeros " + n + " numeros de la sucesion son: ");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }
        }

        scanner.close();
    }
}


