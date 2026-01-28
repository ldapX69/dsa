import java.util.Scanner;

public class InputNumbers{
    public static void main(String[] args) {
        
       // Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

       Scanner sc=new Scanner(System.in);
       double totalSum=0;

       int n=sc.nextInt();
       while (true) {
        String input = sc.next();

        if (input.equalsIgnoreCase("x")) {
            break;
        }

        try {
            double number = Double.parseDouble(input);
            totalSum += number;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number or 'x'.");
        }
    }


    }
}