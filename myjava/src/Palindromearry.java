 class Palindromearry {
     public static void main(String[] args) {
         int[] num=Arrayutility.inputarry();
         System.out.println("wecome to palindrome checker");
         boolean palindrome=palindrome(num);
         if(palindrome){
             System.out.println("yes it is palindrome");
         }else{
             System.out.println("no it is palindrome");
         }
     }
     public static boolean palindrome(int[] num){
         int i=0;
         while (i<num.length){
             if(num[i] !=num[(num.length-1)-i]){

                 return false;
             }i++;
         }return true;
     }
}
