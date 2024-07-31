import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter num ");
        int num = input.nextInt();
        int sum = totals(num);
        System.out.println("totalnum"+num+"is"+ sum);
    }

    public static int totals(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
            return sum;

    }
}




