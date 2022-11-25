package edu.operadores;

public class operadoresLogicos {

    public static void main(String[] args) {
        int a, b;
        
        a = 1;
        b = 2;

        boolean res = a==b;

        if(a <b){
            System.out.println("A nossa condição é verdadeira.");
        }
        
        System.out.println("O número um é igual ao número dois? " + res);
        
        res = a != b;

        System.out.println("O número um é diferente do número dois? " + res);

        res = a > b;

        System.out.println("O número um é maior que o número dois? " + res);
          
    }
    
}
