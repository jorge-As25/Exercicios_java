
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double h,m;
        
        System.out.println("digite a quantidade de horas ");
        h = parseDouble(x.next());
        
        m = h*60;
        
        System.out.println(m);
        
        
    }
    
}
