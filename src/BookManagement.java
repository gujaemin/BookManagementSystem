import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    ArrayList <Book> Books = new ArrayList<Book>();
    Scanner input;
    
    BookManagement(Scanner input){
       this.input = input;
       
    }
 
    public void addBooks() {
       Book book = new Book();
       System.out.println("Type the book's Title : ");
       book.Title = input.next();
       System.out.println("Type the book's Author : ");
       book.Author = input.next();
       System.out.println("Type the book's Publisher : ");
       book.Publisher = input.next();
       System.out.println("Type the book's Id : ");
       book.BookId = input.nextInt();
       Books.add(book);
    }
    public void deleteBooks() {
       System.out.println("Type the book's Id : ");
        int Bookid = input.nextInt();
       int index = -1;
        if(Books == null) {
          System.out.print("no Books Added");
       }
       for(int i=0; i<Books.size();i++) {
          if (Books.get(i).BookId == Bookid) {
             index = i;
             break;
          }
       }
       if (index>=0) {
       Books.remove(index);
       System.out.println("The Book " +Bookid+ " is deleted.");
       }
       else {
          System.out.print("no Books Added");
          return; 
       }
    }
    
    public void editBooks() {
       System.out.println("Type the book's Id : ");
       int BookId = input.nextInt();
       for(int n=0; n<Books.size();n++) {
          Book book = Books.get(n);
          if (book.BookId == BookId) {
             int num = 0;
             while (num !=5) {
                System.out.println("### Book's Info Edit Menu ###");
                System.out.println("1. Edit Title");
                System.out.println("2. Edit Author");
                System.out.println("3. Edit Publisher");
                System.out.println("4. Edit Book's Id");
                System.out.println("5. Exit");
                num = input.nextInt();
                if (num ==1) {
                   System.out.print("Type Title : ");
                   book.Title = input.next();
                }
                else if (num ==2) {
                   System.out.print("Type Author : ");
                   book.Author = input.next(); 
                }
                else if (num ==3) {
                   System.out.print("Type Publisher : ");
                   book.Publisher = input.next();
                }
                else if (num ==4) {
                   System.out.print("Type Book's Id : ");
                   book.BookId = input.nextInt();
                }
                else {
                   break;
                }
             }
             
          }
          
       }
    }
    public void viewBooks() {
    for(Book book : Books ) {
       System.out.println(book.printInfo());
    }
    
 }
}