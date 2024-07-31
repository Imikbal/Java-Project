import java.util.Scanner;
 class fibonaccy {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome ");
         System.out.print("enter number: ");
         int num = input.nextInt();
         System.out.println("fibonaccy number is: " );
         fibonaccy(num);
     }
     public static void fibonaccy(int num){
         if(num<0) return;
         System.out.println("0 ");
         if (num==0) return;
         System.out.println("1 ");
         int first =0, second=1;
         while (first + second<= num){
             int third= first + second;
             System.out.println(third +" ");
             first=second;
             second= third;
         }
     }
}
