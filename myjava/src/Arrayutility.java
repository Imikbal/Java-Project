import java.util.Scanner;
 class Arrayutility {
    public static int[] inputarry (){
        Scanner input= new Scanner(System.in);
        System.out.print("PLEASE ENTER OF NUM ELEMENTS: ");
        int size= input.nextInt();
        int[] nums= new int[size];
        int i=0;
        while (i< size){
            System.out.print("enter your elements " +(i+1) +" : ");
            nums[i]=input.nextInt();
            i++;
        }return nums;
    }

     public static void display(int[]numarry) {
        int i=0;
        while(i < numarry.length){
            System.out.println(numarry[i]+" ");
            i++;
        }

     }
}
