package Book;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.PubFormatException;

public abstract class Book implements BookInput {
	protected BookKind kind;
	protected String Title;
	protected String Author;
	protected String Publisher;
	protected int BookId;

	
//필드
   public Book() {
      
   }
   public Book(BookKind kind) {
	   this.kind = kind;
   }

   public Book(String Title, String Author, String Publisher, int BookId) {
      this.Title = Title;
      this.Author = Author;
      this.Publisher = Publisher;
      this.BookId = BookId;      
   }
   public Book(BookKind kind, String Title, String Author, String Publisher, int BookId) {
	  this.kind = kind;
	  this.Title = Title;
	  this.Author = Author;
	  this.Publisher = Publisher;
	  this.BookId = BookId;      
	   }//생성자
   public BookKind getKind() {
		return kind;
	}

	public void setKind(BookKind kind) {
		this.kind = kind;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public void setPublisher(String publisher) throws PubFormatException {
		if(!publisher.contains("출판사")&& !publisher.equals("")) {
			throw new PubFormatException();
		}
		this.Publisher = publisher;
	}

	public void setId(int bookId) {
		BookId = bookId;
	}
   public String getTitle() {
      return Title;
   }
   public String getAuthor() {
      return Author;
   }
   public String getPublisher(){
      return Publisher;
   }
   public int getBookId() {
      return BookId;
   }
   public void setBookTitle(Scanner input) {
   	System.out.print("Type Title : ");
       String title = input.next();
       this.setTitle(title);	
   }
   public void setBookAuthor(Scanner input) {
   	System.out.print("Type Author : ");
       String author = input.next();
       this.setAuthor(author);	
   }
   public void setBookPublisher(Scanner input) {
	 String publisher = "";
	 while(!publisher.contains("출판사")) {
	   	 	System.out.print("Type Publisher : ");
	        publisher = input.next();
	        try {
				this.setPublisher(publisher);
			} catch (PubFormatException e) {
				System.out.println("부정확한 출판사 이릅입니다! @@출판사 형식으로 써주세요");
			}
	 }
   }
   public void setBookId(Scanner input) {
   	System.out.print("Type Book's Id : ");
       int bookId = input.nextInt();
       this.setId(bookId);
   }
   public void checkAuthorKnown(Scanner input) {
	    boolean isValidInput = false;
	    
	    while (!isValidInput) {
	        try {
	            System.out.println("Is the author of this book known? (Y/N)");
	            char answer = input.next().charAt(0);
	            
	            if (answer == 'y' || answer == 'Y') {
	                setBookAuthor(input);
	                isValidInput = true;
	            } else if (answer == 'n' || answer == 'N') {
	                this.setAuthor("");
	                isValidInput = true;
	            } else {
	                throw new InputMismatchException();
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter 'Y, y' or 'N, n'.");
	            continue; // Restart the loop to receive input again
	        }
	    }
	}

   public String getKindString() {
	   String skind = "none";
	   switch(this.kind) {
	   case Romance :
		   skind = "Romance";
		   break;
	   case Fiction :
		   skind = "Fiction";
		   break;
	   
	   case Thriller :
		   skind = "Thriller";
		   break;
		   
	   case FairyTale :
		   skind = "FairyTale";
		   break;
	   default :			   
	   }
	   return skind;
  }
}
 
