package Book;

import java.util.Scanner;

public interface BookInput {
	public int getBookId();
	
	public void getUserInput(Scanner input); 

	public void setTitle(String title);

	public void setAuthor(String author);

	public void setPublisher(String publisher);

	public void setBookId(int bookId);

	public void printInfo();

}
