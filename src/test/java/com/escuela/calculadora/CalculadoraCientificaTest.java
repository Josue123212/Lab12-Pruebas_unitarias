package com.escuela.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraCientificaTest {

    private final CalculadoraCientifica calc = new CalculadoraCientifica();
    private final double TOL = 1e-9; // tolerancia para comparar doubles

    @Test
    void testSumar() {
        assertEquals(7.0, calc.sumar(3, 4), TOL);
        assertEquals(-1.5, calc.sumar(-3, 1.5), TOL);
    }

    @Test
    void testRestar() {
        assertEquals(-1.0, calc.restar(3, 4), TOL);
        assertEquals(-4.5, calc.restar(-3, 1.5), TOL);
    }

    @Test
    void testMultiplicar() {
        assertEquals(12.0, calc.multiplicar(3, 4), TOL);
        assertEquals(-4.5, calc.multiplicar(-3, 1.5), TOL);
        assertEquals(0.0, calc.multiplicar(0, 100), TOL);
    }

    @Test
    void testDividir() {
        assertEquals(2.0, calc.dividir(8, 4), TOL);
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }

    @Test
    void testPotencia() {
        assertEquals(8.0, calc.potencia(2, 3), TOL);
        assertEquals(0.25, calc.potencia(2, -2), TOL);
    }

    @Test
    void testRaizCuadrada() {
        assertEquals(5.0, calc.raizCuadrada(25), TOL);
        assertThrows(IllegalArgumentException.class, () -> calc.raizCuadrada(-1));
    }

    @Test
    void testFactorial() {
        assertEquals(1L, calc.factorial(0));
        assertEquals(1L, calc.factorial(1));
        assertEquals(120L, calc.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
    }

    @Test
    void testTrigonometria() {
        // pi/2 rad -> sin = 1, cos = ~0
        double pi = Math.PI;
        assertEquals(1.0, calc.seno(pi / 2), 1e-9);
        assertEquals(0.0, calc.coseno(pi / 2), 1e-9);

        // tan(pi/4) = 1
        assertEquals(1.0, calc.tangente(pi / 4), 1e-9);
    }

    @Test
    void testLogaritmos() {
        assertEquals(2.0, calc.logBase10(100), 1e-9);
        assertEquals(1.0, calc.logNeperiano(Math.E), 1e-9);

        assertThrows(IllegalArgumentException.class, () -> calc.logBase10(0));
        assertThrows(IllegalArgumentException.class, () -> calc.logNeperiano(-10));
    }

    @Test
    void testPorcentaje() {
        assertEquals(20.0, calc.porcentaje(200, 10), TOL); // 10% de 200 = 20
        assertEquals(0.0, calc.porcentaje(50, 0), TOL);
    }
}
