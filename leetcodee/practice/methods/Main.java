package leetcodee.practice.methods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // take input of 2 num and print sum

        Scanner sc =new Scanner (System.in);

        System.out.println("enter 1");
        int num1=sc.nextInt();
        System.out.println("enter 2");
        int num2 =sc.nextInt();

        System.out.println(add(num1,num2));
        
     }
        
        public static int add(int num1, int num2){
            return num1+num2;

    }
    
}
