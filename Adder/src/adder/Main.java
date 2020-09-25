package adder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide two integers to add");
        }
    }

    private static int addArguments(String[] args) {
        int howMany, num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many inputs: ");
        // howMany = sc.nextInt();
        sum = 0;
        for (howMany = sc.nextInt(); howMany > 0; howMany--) {
            num1 = 0;
            System.out.println("Enter number " + howMany);
            num1 = sc.nextInt();
            sum += num1;
        }
        
        


        sc.close();
        
        
        // return Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
        return sum;
    }
}
