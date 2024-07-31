import java.util.Scanner;
class isarmstrong{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your num: ");
        int num= input.nextInt();
        boolean out=isarms(num);
        if (out){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    public static boolean isarms(int num){
        int numOfdigit=numOfdigit(num);
        int Final=0;
        int numcopy=num;
        while (num>0){
            int lastdigit=num%10;

            num/=10;
            Final+=pow(lastdigit,numOfdigit);

        }
        System.out.println(Final);
        return Final==numcopy;
    }


    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;}
        return result;
    }
    public static int numOfdigit(int num){
        int resultl=0;
        while (num>0){
            resultl++;
            num/=10;
        }return resultl;
    }
}


