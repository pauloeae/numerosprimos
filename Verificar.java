/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verificadoprimo;

/**
 *
 * @author paulo
 * 
 */
import java.util.Scanner;

public class Verificar {
    
    public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);
    
        System.out.print( "Digite um numero primo: ");
        int numero = scanner.nextInt();
        
        if (Calculadora.isPrimo(numero)) {
            System.out.println(numero + " e primo!");
        } else {
            System.out.println(numero + " nao e primo.");
        }
        scanner.close(); 
        
}
}
