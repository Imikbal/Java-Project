
 class Reversearry {
     public static void main(String[] args) {
         System.out.println("welcome To reversearry");
         int[] numar=Arrayutility.inputarry();
         reverse(numar);
         System.out.println("your arry is: ");
         Arrayutility.display(numar);
     }

     public static void reverse(int[] numar) {
         int i=0;
         while (i < numar.length/2){
             int sawp=numar[i];
             numar[i]=numar[(numar.length - i)-1];
             numar[(numar.length - i)-1]=sawp;
             i++;
         }

     }


}
