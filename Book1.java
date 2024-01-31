package Books;
import Books.Book_template;
import Books.Bookinterface;

public class Book1 extends Book_template {

    String author;
    String title;
    int price;

    Bookinterface b1=new Bookinterface() {
        @Override
        public void Index(int index) {
            System.out.println("Index Starts with Roaman numbers");
        }

        @Override
        public void Bookcover() {
            System.out.println("Its a Binded Book");
        }
    };

    Bookinterface b2=new Bookinterface() {
        @Override
        public void Index(int index) {
            System.out.println("Hi Buddy");
        }

        @Override
        public void Bookcover() {
            System.out.println("Yes Buddy");
        }
    };


    void setTitle(String title){
        System.out.println("Tilte of the the Book: "+title);
    }

//    void

    void setPrice(int price){
        System.out.println("Price of the Book is: "+price);
    }







}
