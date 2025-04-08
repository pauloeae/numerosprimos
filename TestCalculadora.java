/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verificadoprimo;


import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author paulo
 */
public class TestCalculadora {
    
    @Test
    public void testNumerosPrimos() {
        assertTrue(Calculadora.isPrimo(2));
        assertTrue(Calculadora.isPrimo(3));
        assertTrue(Calculadora.isPrimo(13));
        assertTrue(Calculadora.isPrimo(17));
    }

    @Test
    public void testNumerosNaoPrimos() {
        assertFalse(Calculadora.isPrimo(1));
        assertFalse(Calculadora.isPrimo(0));
        assertFalse(Calculadora.isPrimo(9));
        assertFalse(Calculadora.isPrimo(100));
    }

 ////
    
}
