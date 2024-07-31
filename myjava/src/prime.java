import java.util.Scanner;
 class prime {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("welcome to prime number cheacker: ");
         System.out.print("enter your number: ");
         int num= input.nextInt();
         boolean isprime=isprime(num);
         if(isprime){
             System.out.println("no");
         }else{
             System.out.println("yes");
         }
     }

     public static boolean isprime(int num) {
         int i=1;
         while(i<num){
             if(num%i==0){
                 return false;
             }
         }return true;
     }
}
