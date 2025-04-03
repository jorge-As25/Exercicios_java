
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_13 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double km,m;
        
        System.out.println("Digite a quantidade de km ");
        km = parseDouble(x.next());
        
        m = km *1000;
        
        System.out.println(m);
    }
            
}
