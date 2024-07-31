import java.util.Scanner;
 class LCM {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("welcome to lcm");
         System.out.print("enter your first number");
         int first= input.nextInt();
         System.out.print("enter your second");
         int second=input.nextInt();
         int lcm=lcm( first, second);
         System.out.println("two digit number"+lcm);
     }
     public static int lcm(int first,int second){
         int i=1;
         while(i<=second){
             int facto=first*i;
             if(facto% second==0){
                 return facto;
             }i++;
         }return 0;
     }
}
