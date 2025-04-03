
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_15 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double m, h;    
        
        System.out.println("digite a quantidade de minutos ");
        m = parseDouble(x.next());
        
        h = m/60;
        
        System.out.println(m);
        
    }
    
}
