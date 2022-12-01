package edu.dio.criacao;

public class Calculadora {
    
    public static void soma(int num1, int num2) {
        double result = num1 + num2;
        System.out.println("Soma: "+result);
    }

    public static void subtracao(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Subtração: "+result);
    }

    public static void multiplicacao(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Multplicação: "+result);
    }

    public static void divisao(double num1, double num2) {
        double result = num1 / num2;
        System.out.println("Divisão: "+result);
    }
}
