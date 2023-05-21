import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Book.BookInput;
import Book.BookKind;
import Book.FairyTale;
import Book.Fiction;
import Book.Romance;
import Book.Thriller;

public class BookManagement {
    ArrayList <BookInput> Books = new ArrayList<BookInput>();//BookInput을 ArrayList로 관리
    Scanner input;
    BookManagement(Scanner input){
       this.input = input;
    }// 생성자
 
    public void addBooks() {
       BookInput bookInput = null;
       int kind = 0;
       while(kind < 1 || kind > 4) {
    	   try {
    	   showaddBooks();
	       kind  = input.nextInt();
	       switch(kind) {
	       case 1:
	    	   setRomance(bookInput);
	    	   break;
	       
	       case 2:
	    	   setFiction(bookInput);
	    	   break;
	       case 3:
	    	   setThriller(bookInput);
	    	   break;
	       case 4:
	    	   setFairyTale(bookInput);
	    	   break;
	       default:
	    	   System.out.println("Select num for BookKind: ");
	       }
    	   }
    	   catch(InputMismatchException e) {
    		   System.out.println("1~4사이의 값을 입력해주세요!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
    		   
    	   }
       }
    }//addBooks 함수
    public void showaddBooks() {
    	System.out.println("1 for Romance");
	    System.out.println("2 for Fiction");
	    System.out.println("3 for Thriller");
	    System.out.println("4 for FairyTale");
	    System.out.println("Select num for Book Kind Between 1 and 4"); 
    }
    public void setRomance(BookInput bookInput) {
       System.out.println("---Romance---");
 	   bookInput = new Romance(BookKind.Romance);
 	   bookInput.getUserInput(input);
 	   Books.add(bookInput);
    }
    public void setFiction(BookInput bookInput) {
       System.out.println("---Fiction---");
  	   bookInput = new Fiction(BookKind.Fiction);
  	   bookInput.getUserInput(input);
  	   Books.add(bookInput);
    	
    }
    public void setThriller(BookInput bookInput) {
       System.out.println("---Thriller---");
 	   bookInput = new Thriller(BookKind.Thriller);
 	   bookInput.getUserInput(input);
 	   Books.add(bookInput);
    }
    public void setFairyTale(BookInput bookInput) {
       System.out.println("---FairyTale---");
 	   bookInput = new FairyTale(BookKind.FairyTale);
 	   bookInput.getUserInput(input);
 	   Books.add(bookInput);
    	
    }
    public void deleteBooks() {
       System.out.println("Type the book's Id : ");
        int bookId = input.nextInt();
        int index = findIndex(bookId);
         index = findIndex(bookId);
         removefromBooks(index,bookId);
    }
    public int findIndex(int bookId) {
    	int index = -1;
        for(int i=0; i<Books.size();i++) {
            if (Books.get(i).getBookId() == bookId) {
               index  = i;
               break;
            }
         }
        return index;
    }
    public int removefromBooks(int index, int bookId) {
    	//찾는 id가 있는지 확인
        if (index>=0) {
        Books.remove(index);
        System.out.println("The Book " +bookId+ " is deleted.");
        return 1;
        }
        else {
           System.out.println("no Books Added");
           return -1; 
        }//id가 있으면 삭제, 없을시 오류 출력
    	
    }
    
    public void editBooks() {
       System.out.println("Type the book's Id : ");
       int BookId = input.nextInt();
       for(int n=0; n<Books.size();n++) {
          BookInput book = Books.get(n);
          if (book.getBookId() == BookId) {
             int num = 0;
             while (num !=5) {
            	showEditBooks();
                num = input.nextInt();
                switch(num) {
                case 1:
                	book.setBookTitle(input);
                	break;
                case 2:
                	book.setBookAuthor(input);
                	break;
                case 3:
                	book.setBookPublisher(input);
                	break;
                case 4:
                	book.setBookId(input);
                	break;
                default:
                	continue;
                }//switch
             }//while
          }//if
       }//for 
   	  System.out.println("번호에 맞는 책이 없어요!!");
    }//edit 함수
  

    public void viewBooks() {
    System.out.println(Books.size() + "권");
    for(BookInput bookInput : Books ) {
       bookInput.printInfo();
    }
 }
    public void showEditBooks() {
        System.out.println("### Book's Info Edit Menu ###");
        System.out.println("1. Edit Title");
        System.out.println("2. Edit Author");
        System.out.println("3. Edit Publisher");
        System.out.println("4. Edit Book's Id");
        System.out.println("5. Exit");
    	
    }
}