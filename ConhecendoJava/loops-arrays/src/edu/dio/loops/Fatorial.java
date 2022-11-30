package edu.dio.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int fatorial, mult = 1;

        System.out.println("Fatorial: ");
        fatorial = leia.nextInt();

        System.out.print(fatorial + "! = ");

        for(int i = fatorial; i>=1 ; i--){
            mult = mult * i;
        }

        System.out.println(mult);
    }
}
