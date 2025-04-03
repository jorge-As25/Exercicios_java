
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
           Scanner x = new Scanner(System.in);
           
           double saldo = 20000, vr, sf;
           
           System.out.println("Digite o valor que você pretende sacar. o valor atual da sua conta é de " + saldo);
           vr = parseDouble(x.next());
           
           sf = saldo - vr;
           
           System.out.println("o seu saque foi bem sucedido. O saldo da sua conta atualmente é de "+ sf);
           
    }
 
    
    
    
}
