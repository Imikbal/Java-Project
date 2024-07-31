class Book {
    static int totalOfnumber;
    String title;
    String author;
    String isban;
    Boolean isborrowed;
    static {
        totalOfnumber=0;
    }
    {
        totalOfnumber++;
    }
    Book(String title,String author,String isban){
        this.title=title;
        this.author=author;
        this.isban=isban;
    }
    static int getTotalOfnumber(){
        return getTotalOfnumber();
    }
    void borrowed(){
        if(isborrowed){
            System.out.println("the book is already borrowed");
        }else {
            this.isborrowed = true;
        }
    }

}
