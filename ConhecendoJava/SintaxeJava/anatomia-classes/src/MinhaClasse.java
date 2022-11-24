import java.util.Scanner;

public class MinhaClasse {

    public static void main(String[] args) {   
        String primeiroNome = "Lavínia";
        String segundoNome = "Amorim";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome + " " + segundoNome;
    }
    
}
