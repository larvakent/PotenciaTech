package edu.dio.loops;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qntdNum;
        int cont = 0;
        int num;
        int qntdPar = 0;
        int qntdImpar = 0;

        System.out.println("Quantidade de números: ");
        qntdNum = leia.nextInt();

        do {
            System.out.println("Número: ");
            num = leia.nextInt();
            if(num%2==0) qntdPar++;
            else qntdImpar++;
            cont++;
        } while(cont < qntdNum);

        System.out.println("Quantidade de pares: " + qntdPar);
        System.out.println("Quantidade de impares: " + qntdImpar);



    }
}
