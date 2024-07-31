import java.util.Scanner;

class GuessYourNumber {
    int random;
    GuessYourNumber(){
        random=(int) Math.ceil(Math.random()*100);
     }
     int  guess(int guessnum){
        return guessnum -random;
     }



     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         GuessYourNumber game=new GuessYourNumber();
         System.out.println("WELCOME TO  GUESSNUM GAME," +
                 " GUESS YOUR NUMBER BETWEN 1 TO 100");
         int ok;
         int result;
         do {
             System.out.print("please enter your num:");
              ok= input.nextInt();
              result= game.guess(ok);

              if(result==0){
                  System.out.println("number is correct");
              } else if (result<0) {
                  System.out.println("please enter number higher");
              }else {
                  System.out.println("please enter number low");
              }
         }while (result !=0);

     }
}
