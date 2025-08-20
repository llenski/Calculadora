package com.dojo.tdd.Taskmanager.model;

public class Calculadora {

    public Integer somar(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Números não podem ser nulos");
        }
        return num1 + num2;
    }

    public Integer subtrair(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Números não podem ser nulos");
        }
        return num1 - num2;
    }

    public Integer multiplicar(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Números não podem ser nulos");
        }
        return num1 * num2;
    }

    public Integer dividir(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Números não podem ser nulos");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return num1 / num2;
    }

    public Integer potencia(Integer base, Integer expoente) {
        if (base == null || expoente == null) {
            throw new IllegalArgumentException("Base e expoente não podem ser nulos");
        }
        return (int) Math.pow(base, expoente);
    }

    public Integer raizQuadrada(Integer numero) {
        if (numero == null) {
            throw new IllegalArgumentException("Número não pode ser nulo");
        }
        if (numero < 0) {
            throw new IllegalArgumentException("Raiz quadrada de número negativo não é permitida");
        }
        return (int) Math.sqrt(numero);
    }


}
