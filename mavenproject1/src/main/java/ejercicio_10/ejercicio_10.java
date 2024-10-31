/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_10;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ejercicio_10 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero entre 1 y 12: ");
        int mes = scanner.nextInt();
        int dias;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = 28; 
                break;
            default:
                System.out.println("Numero de mes no válido.");
                return;
        }

        System.out.println("El mes " + mes + " tiene " + dias + " dias.");

        scanner.close();
    }
}


