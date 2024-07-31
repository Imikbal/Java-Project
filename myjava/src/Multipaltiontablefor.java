import java.util.Scanner;

class Multipaltiontablefor {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.print("enter your num");
         int num= input.nextInt();

         for (int i=1;i<=10; i++){
             System.out.println(num +"X"+i +"="+(num*i));
         };
     }
}
