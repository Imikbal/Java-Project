import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("welcome to world");
        System.out.println("enter your number");
        int num= input.nextInt();
        boolean result=result(num);
        if(result){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
    public static boolean result (int num){
        int palindrome=palindrome(num);
     return num==palindrome;
    }
    public static int palindrome(int num){
        int newnum=0;
        while (num>0){
            int digit=num%10;
            newnum=newnum*10 +digit;
            num/=10;
        }return newnum;
    }

}