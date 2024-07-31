import java.util.Scanner;
class monthname {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your num: ");
        int num=input.nextInt();
        String methd=month(num);
        System.out.println("month is "+methd);
    }
    public static String month(int num){
        return switch (num){
            case 1 ->"january";
            case 2 ->"february";
            case 3 ->"march";
            case 4 ->"april";
            case 5 ->"may";
            case 6->"june";
            case 7 ->"july";
            case 8->"augest";
            case 9->"september";
            case 10->"october";
            case 11 ->"november";
            case 12 ->"december";
            default -> "invalid";
        };
    }
}
