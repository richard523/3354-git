package adder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
           
            
            System.err.println("Please enter integers");
            
            

        }
    }

    private static int addArguments(String[] args) {
        int howMany = -1;
        int num1, sum;
        Scanner sc = new Scanner(System.in);
        sum = 0;
        System.out.println("Enter how many inputs or negative how many: ");
        // sc.skip("-");
        howMany = sc.nextInt();
        
        if (howMany <= -1){
            howMany =(-1) * howMany;
            
            for (; howMany > 0; howMany--) {
                num1 = 0;
                System.out.println("Enter number " + howMany);
                num1 = sc.nextInt();
                sum -= num1;
                
            }
            sc.close();
        }
        else if (howMany > 0) {
            howMany = sc.nextInt();
            for (; howMany > 0; howMany--) {
                num1 = 0;
                System.out.println("Enter number " + howMany);
                num1 = sc.nextInt();
                sum += num1;
                
            }
            sc.close();
        } 
  


        sc.close();
        
        
        // return Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
        return sum;
    }
}
