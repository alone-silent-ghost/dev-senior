/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_16;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ejercicio_16 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;

        do {
            System.out.print("Ingresa un numero: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                contador++;
            }
        } while (numero < 0);

        System.out.println("Se ingresaron " + contador + " numeros negativos.");
        scanner.close();
    }
}


