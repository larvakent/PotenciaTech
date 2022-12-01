package edu.dio.sobrecarga;

public class Main {
    public static void main(String[] args) {

        System.out.println("Área dos Quadriláteros: ");
        Quadrilatero.area(4);
        Quadrilatero.area(4d, 8d);
        Quadrilatero.area(6, 4, 5);
        Quadrilatero.area(7f, 4f);
    }
}
