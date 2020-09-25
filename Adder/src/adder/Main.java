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
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
        
        // return Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
        return sum;
    }
}
