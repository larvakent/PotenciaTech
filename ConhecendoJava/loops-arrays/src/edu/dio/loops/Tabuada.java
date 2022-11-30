package edu.dio.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int tabuada;

        System.out.println("Tabuada: ");
        tabuada = leia.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }

    }
}
