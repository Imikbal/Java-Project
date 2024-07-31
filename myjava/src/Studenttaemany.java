import java.util.Scanner;
class Studenttaemany {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome student secore \n");
        System.out.print("enter your secore:");
        int num= input.nextInt();
        String mark=num>80?"high":(num>50?"moderate":"low");
        System.out.println("your marks is: "+mark);
    }
}
