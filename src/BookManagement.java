import java.util.ArrayList;
import java.util.Scanner;

import Book.Book;
import Book.FairyTale;
import Book.Fiction;
import Book.Thriller;

public class BookManagement {
    ArrayList <Book> Books = new ArrayList<Book>();//book을 담는 배열 books 선언
    Scanner input;
    
    BookManagement(Scanner input){
       this.input = input;
       
    }//생성자
 
    public void addBooks() {
       Book book = new Book();
       int kind = 0;
       while(kind != 1 && kind != 2 && kind !=3) {
	       System.out.println("1 for Romance");
	       System.out.println("2 for Fiction");
	       System.out.println("3 for Thriller");
	       System.out.println("4 for FairyTale");
	       System.out.println("Select num for Book Kind Between 1 and 4"); 
	       kind  = input.nextInt();
	       if( kind == 1) {
	    	   book = new Book();
	    	   book.getUserInput(input);
	    	   Books.add(book);
	    	   break;
	    	   
	       }
	       else if ( kind == 2 ) {
	    	   book = new Fiction();
	    	   book.getUserInput(input);
	    	   Books.add(book);
	    	   break;  
	       }
	       else if (kind == 3) {
	    	   book = new Thriller();
	    	   book.getUserInput(input);
	    	   Books.add(book);
	    	   break;
	       }
	       else if (kind == 4) {
	    	   book = new FairyTale();
	    	   book.getUserInput(input);
	    	   Books.add(book);
	    	   break;
	       }
	       
	       else {
	    	   System.out.println("Select num for BookKind: ");
	       }
       
       }
  
    }//addBooks 함수
    public void deleteBooks() {
       System.out.println("Type the book's Id : ");
        int Bookid = input.nextInt();
       int index = -1;
        if(Books == null) {
          System.out.println("no Books Added");
       }
       for(int i=0; i<Books.size();i++) {
          if (Books.get(i).getBookId() == Bookid) {
             index = i;
             break;
          }
       }//찾는 id가 있는지 확인
       if (index>=0) {
       Books.remove(index);
       System.out.println("The Book " +Bookid+ " is deleted.");
       }
       else {
          System.out.print("no Books Added");
          return; 
       }//id가 있으면 삭제, 없을시 오류 출력
    }
    
    public void editBooks() {
       System.out.println("Type the book's Id : ");
       int BookId = input.nextInt();
       for(int n=0; n<Books.size();n++) {
          Book book = Books.get(n);
          if (book.getBookId() == BookId) {
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
                   String title = input.next();
                   book.setTitle(title);
                }
                else if (num ==2) {
                   System.out.print("Type Author : ");
                   String author = input.next();
                   book.setAuthor(author);
                }	
                else if (num ==3) {
                   System.out.print("Type Publisher : ");
                   String publisher = input.next();
                   book.setPublisher(publisher);
                }
                else if (num ==4) {
                   System.out.print("Type Book's Id : ");
                   int bookId = input.nextInt();
                   book.setBookId(bookId);
                }
                else {
                   break;
                }
             }//while문으로 어떤 항목 edit할지 결정 및 수정
             
          }
          
       }
    }//edit 함수
    public void viewBooks() {
    System.out.println(Books.size() + "권");
    for(Book book : Books ) {
       System.out.println(book.printInfo());
    }
    
 }//지금까지 입력한 책 출력
}