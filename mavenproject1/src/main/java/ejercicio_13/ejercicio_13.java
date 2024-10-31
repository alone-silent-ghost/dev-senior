/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_13;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ejercicio_13 {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el numero del primer hermano que llego a tiempo: ");
        int hermano1 = scanner.nextInt();

        System.out.print("Ingresa el numero del segundo hermano que llego a tiempo: ");
        int hermano2 = scanner.nextInt();

        int hermanoTarde = (hermano1 + hermano2); 

        System.out.println("El hermano que llegara tarde es: " + hermanoTarde);

        scanner.close();
    }
}


 



