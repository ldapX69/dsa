import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunction {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int[] nums ={3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    void dArray(){
        int[][] arrr =new int[3][];
        int [][] arr2D={
                {1,2,3},
                {4,5},
                {6,7,8}
        };
        //input
    }


    static void change(int[] arr){
        arr[0]=99;
    }
}
