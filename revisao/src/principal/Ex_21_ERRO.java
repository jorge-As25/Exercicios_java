
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_21_ERRO {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double venda = 0;
        double pecas;
        double total;
        double comis;
        
        
        System.out.println("digite o valor da peça vendida ");
        venda = parseDouble(x.next());
        
        System.out.println("Digite a quantidades de peças vendidas ");
        pecas = parseDouble(x.next());
        
        total = pecas + venda;
        
        comis = total * 0.05;
        
        System.out.println(comis);
    }
    
}
