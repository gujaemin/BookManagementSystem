package Book;

import java.util.Scanner;

import exception.PubFormatException;

public interface BookInput {
	public int getBookId();
	
	public void getUserInput(Scanner input); 

	public void setTitle(String title);

	public void setAuthor(String author);

	public void setPublisher(String publisher) throws PubFormatException;

	public void setId(int bookId);

	public void printInfo();
	
	 public void setBookTitle(Scanner input);
	 public void setBookAuthor(Scanner input);
	 public void setBookPublisher(Scanner input);
	 public void setBookId(Scanner input);
	 public void checkAuthorKnown(Scanner input);  
}
