class Solutions{
    static void main() {

        System.out.println(sum(1,2,3));
        System.out.println(sum(10));
        System.out.println();
        System.out.println(sum(5,-5,10,20));
        System.out.println(sum(100,200,300,400));


    }

    public static int sum(int... nums){
        int total =0;
        /*for(int i: nums){
            total+=i;
        }*/

        for (int i =0;i<nums.length;i++){
             total=total+nums[i];
        }
        return total;
    }
}