 class Calculator {
    public int add(int first,int second){
        return first+second;
    }
    public int add(int first,int second,int third){
        return first+second+third;
    }
    public double add(double first,double second){
        return first+second;
    }

     public static void main(String[] args) {
         Calculator call=new Calculator();
         System.out.println(call.add(   1,2,3));
         System.out.println(call.add(1.1,2.2));
     }

}
