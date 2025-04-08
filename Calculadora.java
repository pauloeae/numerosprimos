/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificadoprimo;

/**
 *
 * @author paulo
 * 
 * Aqui esta a classe para calcular se é primo ou não
 *
 *
 */


public class Calculadora {

    
    public static boolean isPrimo(int n) {
        if (n <= 1) { /// se for menor ou igual a 1 
            return false; /// ele vai retorna falso
        }
        for (int i = 2; i <=  
            Math.sqrt(n); i++) ///começando com 2 e vai ate raiz do numero digitado
        {  if (n % i == 0){ /// aqui ele verifica se nao a divisor por o numero digitado
            return false; /// retornara falso
        
    
    }
}
        return true; /// aqui depois de o numero passar por 
                    ///todas as verificação ele vai retorna verdadeiro
    }
}

