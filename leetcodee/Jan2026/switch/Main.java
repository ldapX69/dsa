//package leetcodee.Jan 2026.switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        String fruit =sc.next();

        String a="abhijeet";
        String b="abhijeet";
        System.out.println(a==b);

        switch(fruit){
            case "mango" -> System.out.println();
            case "banana" -> System.out.println("A sweet fruit");
            
        }
    }
    
}
