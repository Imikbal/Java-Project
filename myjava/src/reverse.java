import java.util.Scanner;
 class reverse {
     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         System.out.println("welcome");
         System.out.print("enter numer: ");
         int num= input.nextInt();
         int reverse=reverse(num);
         System.out.println("reverse number is: "+reverse);
     }
     public static int reverse(int num){
         int newnum=0;
         while (num>0){
             int digit=num % 10;
             newnum= newnum * 10 + digit;
             num/=10;

         }return newnum;
     }
}
