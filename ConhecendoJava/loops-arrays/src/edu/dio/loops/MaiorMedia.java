package edu.dio.loops;
import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int cont = 0;
        int maior = 0;
        int soma = 0;
        
        do {
           System.out.println("Número: ");
           numero = leia.nextInt();
           soma = soma + numero;

            if(numero > maior) maior =  numero;

           cont = cont + 1;
        } while(cont < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + (soma/5));
    }
}
