
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_20 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        double a =0 ,b = 0, c = 0,d = 0;
        double A,B,C,D;
        double soma = 0;
        
        
        
        System.out.println("Digite o primeiro numero ");
        a = parseDouble(x.next());
        
        System.out.println("Digite o segundo numero ");
        b = parseDouble(x.next());
        
        System.out.println("Digite o terceiro numero ");
          c = parseDouble(x.next());
        
        System.out.println("Digite o quarto numero ");
          d = parseDouble(x.next());
       
          A = a*a;
          B = b*b;
          C= c*c;
          D=d*d;
         
          
          soma = A+B+C+D;
          
           System.out.println(soma);
          
         
          
        
    }
    
}
