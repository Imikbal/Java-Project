import java.util.Scanner;

class CalcutarTryCatch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number: ");
        int f= input.nextInt();
        System.out.println("enter second number: ");
        int s= input.nextInt();
        try {
            int result=f/s;
            System.out.println("Result is: "+result);
        }catch (ArithmeticException exception){
            if (exception.getMessage().equals("/by zero")){
                System.out.println("divided by zero");
            }else{
                throw exception;
            }


        }
    }
}
