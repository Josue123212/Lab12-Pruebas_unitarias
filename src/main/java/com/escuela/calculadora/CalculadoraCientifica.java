package com.escuela.calculadora;

public class CalculadoraCientifica {

    // Operaciones básicas
    public double sumar(double a, double b) {
    return a + b ; // Correccion
}


    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }

    // Potencia: a^b
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Raíz cuadrada
    public double raizCuadrada(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("No se puede calcular raíz de número negativo");
        }
        return Math.sqrt(x);
    }

    // Factorial (solo enteros >= 0). Devuelve long.
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para negativos");
        }
        long resultado = 1L;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Funciones trigonométricas (argumento en radianes)
    public double seno(double rad) {
        return Math.sin(rad);
    }

    public double coseno(double rad) {
        return Math.cos(rad);
    }

    public double tangente(double rad) {
        return Math.tan(rad);
    }

    // Logaritmos
    public double logBase10(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Log base 10 requiere x > 0");
        }
        return Math.log10(x);
    }

    public double logNeperiano(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Log natural requiere x > 0");
        }
        return Math.log(x);
    }

    // Porcentaje: devuelve 'porcentaje'% de 'valor'
    public double porcentaje(double valor, double porcentaje) {
        return valor * (porcentaje / 100.0);
    }
}
