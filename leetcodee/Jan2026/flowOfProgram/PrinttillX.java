import java.util.Scanner;

public class PrinttillX {

    static void main() {
        Scanner sc=new Scanner(System.in);

      int sum=0;
      for(;;) {
          System.out.println("enter number (or 'x' to stop): ");
          String input =sc.next();

          if (input.equalsIgnoreCase("x")){
              break;
          }
          try {
              int num =Integer.parseInt(input);
              sum+=num;
          } catch (NumberFormatException e){
              System.out.println("Invalid input, please enter number or x");
          }
      }
        System.out.println("sum of all numbers : "+ sum);
      sc.close();
    }
}
