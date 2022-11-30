package edu.dio.loops;
/*Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo 
 * representando a sua idade. (Pare o pprograma inserindo
 * o valor 0 no campo nome) 
 */

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = leia.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade= leia.nextInt();
        }
       
        System.out.println("Continua aqui...");

        
    }
    
}
