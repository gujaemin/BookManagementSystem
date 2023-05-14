package Book;

import java.util.Scanner;

public abstract class Book {
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

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public void setBookId(int bookId) {
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
  
   public abstract void printInfo();

   	//인스턴스 변수 값 반환 메소드
  
}
 
