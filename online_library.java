
class library{

        String[] books;
        int noofbooks;
    library(){
        this.books=new String[100];
    }

    public void addbook(String book) {
        this.books[noofbooks] = book;
        noofbooks++;
        System.out.println("the book has been added succesfull: " +book);
    }
    void issuebook(String book){
       for(int i=0; i<this.books.length;i++) {
           if (this.books[i].equals(book)) {
               System.out.println("the book has been issued sucssefully:  ");
               this.books[i] = null;
               return;
           }
       }
               System.out.println("this book dont exit ");

       }


    public void returnbook(String book){
        addbook(book);
        }

    public void showavaliablebooks(){
        for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("*" +book);

        }
    }
}


public class online_library {
    public static void main(String []args){
        library gg = new library();
        gg.addbook("gg");
        gg.addbook("one piece");
        gg.addbook("elden ring");
        gg.showavaliablebooks();
      gg.issuebook("gg");
      gg.showavaliablebooks();
      gg.returnbook("elden ring");
    }
}
