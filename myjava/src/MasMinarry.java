import java.util.Scanner;
 class MasMinarry {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int[] numar = Arrayutility.inputarry();
         System.out.println("welcome to arry mas, min");
         int max=max(numar);
         int min=min(numar);
         System.out.println("Mas number is: "+max);
         System.out.println("Min number is: "+min);
     }

     public static int min (int[] numar) {
        int min=Integer.MAX_VALUE;
        int i=0;
        while(i < numar.length){
            if (min >numar[i]){
                min=numar[i];

            }i++;
        }return min;

     }
     public static int max (int[] numar) {
        if (numar.length==0){
            return Integer.MIN_VALUE;
        }
        int max=numar[0];
        int i=1;
        while(i < numar.length){
            max=numar[i];
            i++;
        }

         return max ;
     }
 }
