
package principal;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        Scanner recebeDados = new Scanner(System.in);
        double numeroDigitado = 0;
        
        System.out.println("Digite um numero: ");
        
        numeroDigitado = Double.parseDouble(recebeDados.next());
        
        System.out.println("O numero digitado é: " + numeroDigitado);
        
        if(numeroDigitado %2 == 0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
        
    }
    
}
