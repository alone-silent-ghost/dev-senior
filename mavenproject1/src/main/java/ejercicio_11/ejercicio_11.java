/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_11;

/**
 *
 * @author User
 */
 import java.util.Scanner;
import java.util.Arrays;
public class ejercicio_11 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        int num3 = scanner.nextInt();

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        String resultado = "" + numeros[0] + numeros[1] + numeros[2];
        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}


