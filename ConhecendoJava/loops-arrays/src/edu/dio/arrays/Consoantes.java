package edu.dio.arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntdCon = 0;

        int cont = 0;
        do {
            System.out.println("Letra: ");
            String letra = leia.next();

            if(!(letra.equalsIgnoreCase("a") ||
                 letra.equalsIgnoreCase("e") ||
                 letra.equalsIgnoreCase("i") ||
                 letra.equalsIgnoreCase("o") ||
                 letra.equalsIgnoreCase("u") )){
               consoantes[cont] = letra;
               qntdCon++;     
                 }

            cont++;

        } while (cont < consoantes.length);

        System.out.print("Consoantes: ");
        for(String consoante : consoantes){
            if(consoante != null)
            System.out.print(consoante + " ");
        }

        System.out.println("Quantidade de consoantes: " + qntdCon);
        System.out.println(consoantes.length);
    }    
}
