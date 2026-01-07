import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);

        int year =2024;
        if(isLeapYear(year)){
            System.out.println("yes");
        }else{
            System.out.println("no"+year);
        }
    }
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }
    
}


