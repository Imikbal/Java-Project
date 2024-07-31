import java.util.Scanner;

class PasswordChecker {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("welcome to password checker \n");
         String password;
         do {
             System.out.print("enter your passwod");
              password= input.next();
         }while (!isvalid(password));
         System.out.println("your password valid");
     }public static boolean isvalid(String passwprd){
         return 5< passwprd.length();
    }
}
