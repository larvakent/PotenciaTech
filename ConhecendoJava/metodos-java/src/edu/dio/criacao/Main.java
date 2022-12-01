package edu.dio.criacao;

public class Main {
    public static void main(String[] args) {
        
        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(2, 4);
        Calculadora.subtracao(9, 4.5);
        Calculadora.multiplicacao(2, 5);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);        

    }

}
