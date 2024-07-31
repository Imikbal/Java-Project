import java.util.Scanner;
 class Minimumtarmany {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("welcome to check minimun number");
         System.out.print("enter your first num:");
         int num1= input.nextInt();
         System.out.print("enter your secound num:");
         int num2= input.nextInt();
         Minimumtarmany metod=new Minimumtarmany();
         int num=metod.minimum(num1,num2);
         System.out.println("minimum number"+ num);
     }
     public  int minimum(int num1,int num2){
         if (num1 > num2){
             return num2;
         }else {
             return num1;
         }
     }
}
