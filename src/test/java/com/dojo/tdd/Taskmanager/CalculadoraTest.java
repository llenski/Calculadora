package com.dojo.tdd.Taskmanager;

import com.dojo.tdd.Taskmanager.model.Calculadora;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculadoraTest {

    @Test
    void deveSomar() {

        Integer num1 = 1;
        Integer num2 = 2;

        Calculadora calc = new Calculadora();

        Integer resultado = calc.somar(num1, num2);

        assertEquals(3, resultado);
        assertNotNull(resultado, "Resultado não pode ser nulo");
        assertTrue(resultado > 0, "Resultado deve ser positivo");

    }

    @Test
    void deveSubtrair() {
        Calculadora calc = new Calculadora();
        Integer resultado = calc.subtrair(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    void deveMultiplicar() {
        Calculadora calc = new Calculadora();
        Integer resultado = calc.multiplicar(4, 3);
        assertEquals(12, resultado);
    }

    @Test
    void deveDividir() {
        Calculadora calc = new Calculadora();
        Integer resultado = calc.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    void deveLancarExcecaoDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
        assertEquals("Divisão por zero não é permitida", exception.getMessage());
    }

    @Test
    void deveCalcularPotencia() {
        Calculadora calc = new Calculadora();
        Integer resultado = calc.potencia(2, 3);
        assertEquals(8, resultado);
    }

    @Test
    void deveCalcularRaizQuadrada() {
        Calculadora calc = new Calculadora();
        Integer resultado = calc.raizQuadrada(9);
        assertEquals(3, resultado);
    }

    @Test
    void deveLancarExcecaoRaizQuadradaNegativa() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.raizQuadrada(-4));
        assertEquals("Raiz quadrada de número negativo não é permitida", exception.getMessage());
    }

    @Test
    void deveLancarExcecaoArgumentoNuloSoma() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.somar(null, 2));
        assertEquals("Números não podem ser nulos", exception.getMessage());
    }

    @Test
    void deveLancarExcecaoArgumentoNuloSubtracao() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.subtrair(2, null));
        assertEquals("Números não podem ser nulos", exception.getMessage());
    }

    @Test
    void deveLancarExcecaoArgumentoNuloMultiplicacao() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.multiplicar(null, 2));
        assertEquals("Números não podem ser nulos", exception.getMessage());
    }

    @Test
    void deveLancarExcecaoArgumentoNuloDivisao() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.dividir(2, null));
        assertEquals("Números não podem ser nulos", exception.getMessage());
    }

    @Test
    void deveLancarExcecaoArgumentoNuloPotencia() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.potencia(null, 2));
        assertEquals("Base e expoente não podem ser nulos", exception.getMessage());
    }

    @Test
    void deveLancarExcecaoArgumentoNuloRaizQuadrada() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.raizQuadrada(null));
        assertEquals("Número não pode ser nulo", exception.getMessage());
    }
}
