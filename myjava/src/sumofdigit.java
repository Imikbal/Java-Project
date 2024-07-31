import java.util.Scanner;
 class sumofdigit {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("welcome to digit");
         System.out.print("enter your numm; ");
         int num= input.nextInt();
         int sum=facto(num);
         System.out.println("sum of digit: "+sum);
     }
     public static int facto(int num){
         int sum=0;

         while (num>0){
             sum+=num%10;
             num=num/10;
         }
         return sum;
     }

}
