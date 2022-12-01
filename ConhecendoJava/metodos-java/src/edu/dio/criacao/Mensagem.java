package edu.dio.criacao;

public class Mensagem {
    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12:
                mensagemBomDia();
                break;
            case 13, 14, 15, 16, 17:
                mensagemBoaTarde();
                break;
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 :
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora inválida.");
                break;
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Bom tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Bom noite!");
    }
}
