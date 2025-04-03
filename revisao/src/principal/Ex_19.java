
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_19 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double dolar;
        double cv;
        
        System.out.println("Digite o valor em dolar ");
        dolar= parseDouble(x.next());
        
        cv = dolar * 5.37;
        
        System.out.println(cv);
        
        
        
    }
    
}
