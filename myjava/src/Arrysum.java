import java.util.Scanner;
 class Arrysum {
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.print("enter your num: ");
         int size= input.nextInt();
         int[] nums= new int[size];
         int i=0;
         while (i< size){
             System.out.print("enter your elements " +(i+1) +" : ");
             nums[i]=input.nextInt();
             i++;
         }
         int avarage=avarage(nums);
         long sum=sum(nums);
         System.out.println("total sum is:  " + sum);
         System.out.println("total avarage is:  " + avarage);
     }

     public static long sum(int[]nums) {
         long total=0;
         int i=0;
         while (i< nums.length){
             total+=nums[i];
             i++;

         }  return total;
     }

     public static int avarage(int[]nums) {
         long total=sum(nums);
         return (int) (total/nums.length);

     }


}
