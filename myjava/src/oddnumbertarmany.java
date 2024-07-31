import java.util.Scanner;
 class oddnumbertarmany {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to check");
         System.out.print("enter your  number");
         int num1 = input.nextInt();
         String result=num1%2==0?"even":"odd";
         System.out.println("your number is : "+result);
     }

 }
