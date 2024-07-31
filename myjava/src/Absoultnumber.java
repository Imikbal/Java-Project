import java.util.Scanner;
class Absoultnumber {
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        System.out.println("enter your number :");
        int num= input.nextInt();
        int result=num>=0?num:-num;
        System.out.println("absoult number: "+result);
    }
}
