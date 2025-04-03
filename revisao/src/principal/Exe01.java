package principal;

import java.util.Scanner;

public class Exe01 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        double primeiro = 0;
        double segundo = 0;
        double soma;

        System.out.println("digite o primeiro numero: ");
        primeiro = Double.parseDouble(numero.next());

        System.out.println("Digite o segundo numero: ");
        segundo = Double.parseDouble(numero.next());

        soma = primeiro + segundo;

        System.out.println("A soma entre os dois numero: " + soma);

    }

}
