import java.util.Scanner;
 class calcuttar {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("welcome to my calcuttar");
         System.out.print("enter 1st number: ");
         int num1= input.nextInt();
         System.out.print("enter 2nd number: ");
         int num2= input.nextInt();
         System.out.print("enter your operator: ");
         String operator= input.next();

         int result=switch (operator){
             case "+"->num1+num2;
             case "-"->num1-num2;
             case "*"->num1*num2;
             case "/"->num1/num2;
             default -> -1;

             };
         System.out.println("your result is"+result);
         }

     }


