import java.util.Scanner;

class uccrenccesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to occrreccArray");
        int[] numar = Arrayutility.inputarry();
        System.out.println("Now Enter your num of find: ");
        int num = input.nextInt();
        int Numofuccrencces = Numofuccrencces(numar, num);
        System.out.println("number of is find it: " + Numofuccrencces);
    }

    public static int Numofuccrencces(int[] numar, int num) {
        int occ = 0;
        int i = 0;
        while (i < numar.length) {
            if (numar[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
