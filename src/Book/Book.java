package Book;

import java.util.Scanner;

public class Book {
	protected BookKind kind = BookKind.Romance;
	protected String Title;
	protected String Author;
	protected String Publisher;
	protected int BookId;

	
//필드
   public Book() {
      
   }

   public Book(String Title, String Author, String Publisher, int BookId) {
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
   public String printInfo(Book book) {
      return "Book{Genre : " + book.kind + " Title : " + Title +" Author : "+ Author+" Publisher : "+ Publisher+" BookId : "+BookId+"}";
   }//인스턴스 변수 값 반환 메소드
   public void getUserInput(Scanner input) {
	   
	   System.out.println("Type the book's Title : ");
       String title = input.next();
       this.setTitle(title);
       System.out.println("Type the book's Author : ");
       String author = input.next();
       this.setAuthor(author);
       System.out.println("Type the book's Publisher : ");
       String publisher = input.next();
       this.setPublisher(publisher);
       System.out.println("Type the book's Id : ");
       int bookId = input.nextInt();
       this.setBookId(bookId);
   }
}
 
