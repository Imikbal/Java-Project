import java.util.Scanner;

class Guessinggame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=5 ,guess;
        do {
            System.out.print("guess number");
            guess= input.nextInt();
        }while (num!=guess);
        System.out.println("right number ");
    }
}
