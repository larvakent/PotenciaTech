package edu.dio.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = leia.nextInt();

        while(nota <0 || nota > 10){
            System.out.println("Nota invalida! Digite novamente: ");
            nota = leia.nextInt();
        }

    }
    
}
