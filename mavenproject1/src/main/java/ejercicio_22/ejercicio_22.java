/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_22;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ejercicio_22 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char jugador1, jugador2;
        String continuar;

        do {
            System.out.print("Jugador 1, ingresa P para piedra, L para papel, o T para tijera: ");
            jugador1 = scanner.next().charAt(0);

            System.out.print("Jugador 2, ingresa P para piedra, L para papel, o T para tijera: ");
            jugador2 = scanner.next().charAt(0);

            if (jugador1 == jugador2) {
                System.out.println("Es un empate!");
            } else if ((jugador1 == 'P' && jugador2 == 'T') ||
                       (jugador1 == 'L' && jugador2 == 'P') ||
                       (jugador1 == 'T' && jugador2 == 'L')) {
                System.out.println("Jugador 1 gana la ronda");
            } else {
                System.out.println("Jugador 2 gana la ronda");
            }

            System.out.print("Desean volver a jugar? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        scanner.close();
        System.out.println("Gracias por jugar!");
    }
}


