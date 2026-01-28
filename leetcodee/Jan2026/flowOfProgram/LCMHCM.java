import java.util.Scanner;

public class LCMHCM{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        int n1 =sc.nextInt();
        int n2=sc.nextInt();

        int a=n1;
        int b=n2;

        while (b!=0) {
            int remainder =a%b;
            a=b;
            b=remainder;
                   
        }
        System.out.println(a);

        int hcf=a;
        int lcm=(n1*n2) /hcf;

        System.out.println("hcf "+ hcf);
        System.out.println("LCM "+ lcm);

        
    }
}