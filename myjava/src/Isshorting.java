import java.util.Scanner;
 class Isshorting {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int[] numsa=Arrayutility.inputarry();
         System.out.println("Welcome to shorting chechk:\n");
         boolean  isin=isincreasing(numsa);
         boolean  isdin=isdcreasing(numsa);
         if(isin || isdin){
             System.out.println("NUMBER IS shorted");
         }else {
             System.out.println("NUMBER IS not  shorted");
         }

     }

     public static boolean isincreasing(int[] numsa){
         int i=1;
         while(i< numsa.length){
             if(numsa[i] > numsa[i-1]){
                 return false;
             }i++;
         }
         return true;
     }
     public static boolean isdcreasing(int[] numsa){
        int i=1;
        while(i < numsa.length){
            if(numsa[i] < numsa[i-1]){
                return false;
            }i++;
        }
         return true;
     }
}
