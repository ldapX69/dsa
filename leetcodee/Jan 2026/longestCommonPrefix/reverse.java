public class reverse {

    public static void main(String[] args) {
        //Q reverse
        // n=23597
        int n= 79532;

        int count =0;
        while (n>0) {
            int rem=n%10;
            n/=10;
            count=count*10+rem;
            
        }


    }
    
}
