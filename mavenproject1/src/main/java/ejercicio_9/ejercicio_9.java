/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_9;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ejercicio_9 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de camisas: ");
        int cantidad = scanner.nextInt();
        int precioPorUnidad;

        if (cantidad > 0 && cantidad <= 50) {
            precioPorUnidad = 50000;
        } else if (cantidad <= 100) {
            precioPorUnidad = 45000;
        } else if (cantidad <= 150) {
            precioPorUnidad = 40000;
        } else if (cantidad <= 200) {
            precioPorUnidad = 35000;
        } else if (cantidad > 200) {
            precioPorUnidad = 25000;
        } else {
            System.out.println("Cantidad no válida.");
            return;
        }

        System.out.println("El precio por unidad es: $" + precioPorUnidad);

        scanner.close();
    }
}


