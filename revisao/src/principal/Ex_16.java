
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

public class Ex_16 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
              
        double m,s;
        
        System.out.println("digite a quantidade de minutos ");
        m = parseDouble(x.next());
        
        s = m*60;
        
        System.out.println(m);
        
    }
    
}
