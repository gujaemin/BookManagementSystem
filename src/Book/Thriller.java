package Book;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Thriller extends Book{
	   int ThrillerType;
	   String type;
	   public Thriller(BookKind kind) {
		   this.kind = kind;
	   }
	public void getUserInput(Scanner input) {
		   setBookTitle(input);
		   checkAuthorKnown(input);
	       setBookPublisher(input);
	       System.out.println("Type the Thriller's Type ");
	       System.out.println("1 : Psychological Thriller 2 : Crime Thriller 3 : Supernatural Thriller");

	       int thrillerType = 0;
	       boolean isValidInput = false;

	       while (!isValidInput) {
	           try {
	               thrillerType = input.nextInt();

	               switch (thrillerType) {
	                   case 1:
	                       type = "Psychological Thriller";
	                       isValidInput = true;
	                       break;
	                   case 2:
	                       type = "Crime Thriller";
	                       isValidInput = true;
	                       break;
	                   case 3:
	                       type = "Supernatural Thriller";
	                       isValidInput = true;
	                       break;
	                   default:
	                       throw new InputMismatchException();
	               }
	           } catch (InputMismatchException e) {
	               System.out.println("Invalid input. Please enter a value between 1 and 3.");
	               continue; // Restart the loop to receive input again
	           }
	       }

	       
	       setBookId(input);
	       
	       
	   }
	public void printInfo() {
		   String skind = getKindString();
	       System.out.println("Book{Kind : "+ skind +"\tTitle : " + Title +"\tAuthor : "+ Author+"\tPublisher : "+ Publisher+"\tThriller's Type : " +type + "\tBookId : "+BookId+"}");
		   }
}
