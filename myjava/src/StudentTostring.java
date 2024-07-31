class StudentTostring {
    String name;
    int age;
    String rollnum;
    String house;

     public StudentTostring(String name, int age, String rollnum, String house) {
         this.name = name;
         this.age = age;
         this.rollnum = rollnum;
         this.house = house;
     }

     @Override
     public String toString() {
         return "students deatils:{name:"+name+
                 ", age:"+age+", rollnum:"+rollnum+", house:"+house+"}";
     }

     public static void main(String[] args) {
         StudentTostring sru=new StudentTostring("ikbal"
                 ,18,"13561","hossain");
         System.out.println(sru);
     }

 }