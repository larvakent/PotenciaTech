package edu.classes;

import java.util.Scanner;

public class BoletimEscolar {

    public static void main(String[] args) {
        
        int mediaFinal;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a média do aluno: ");
        mediaFinal = leitor.nextInt();

        if(mediaFinal < 6){
            System.out.println("REPROVADO");
        } else {
            if(mediaFinal == 6) {
                System.out.println("RECUPERAÇÃO");
            } else {
                System.out.println("APROVADO");
            }
        }
    }
    
}
