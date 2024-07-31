import java.util.Scanner;

class Isprimefor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to prime number checker");
        System.out.print("enter your num:- ");
        int num= input.nextInt();
        boolean isprime=isprime(num);
        System.out.println("your number is"+(isprime?"prime":"not prime"));
    }
    public static boolean isprime(int num){
        if(num==0){
            return false;
        }for (int i=2;i<=num;i++){

            if(num%i==0){
               return false;
           }
        }

        return true;
    }
}
