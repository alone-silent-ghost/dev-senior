/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_20;

/**
 *
 * @author User
 */
public class ejercicio_20 {
   
    public static void main(String[] args) {
        int tamaño = 8;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("| B ");
                } else {
                    System.out.print("| N ");
                }
            }
            System.out.println("|");
        }
    }
}
 

