import java.util.Scanner;
class factorial{
    public static void main(String[] args) {
        System.out.println("welcome to factorial");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        long fact=facto(num);
        System.out.println("factorial is "+fact);
    }
    public static long facto(int num){
        if(num<2){
            return 1;
        }
        long fact=1;
        int i=2;
        while(i<=num){
            fact*=i;
            i+=1;
        }
        return fact;
    }
}