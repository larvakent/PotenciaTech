package edu.dio.loops;
import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int cont = 0;
        
        do {
           System.out.println("Número: ");
           numero = leia.nextInt();
           cont = cont + 1;
        } while(cont < 5);
    }
}
