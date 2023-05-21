package Book;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fiction extends Book{
	   int FictionType;
	   String type;
	   public Fiction(BookKind kind) {
		   this.kind = kind;
	   }
	public void getUserInput(Scanner input) {
		   
		   setBookTitle(input);
	       checkAuthorKnown(input);
	       setBookPublisher(input);
	       System.out.println("Type the Fiction's Type ");
	       System.out.println("1 : Fantasy Fiction 2 : Science Fiction 3 : Mystery Fiction");

	       int fictionType = 0;
	       boolean isValidInput = false;

	       while (!isValidInput) {
	           try {
	               fictionType = input.nextInt();
	               input.nextLine(); // Clear the input buffer
	               
	               switch (fictionType) {
	                   case 1:
	                       type = "Fantasy Fiction";
	                       isValidInput = true;
	                       break;
	                   case 2:
	                       type = "Science Fiction";
	                       isValidInput = true;
	                       break;
	                   case 3:
	                       type = "Mystery Fiction";
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
	       System.out.println("Book{Kind : "+ skind +"\tTitle : " + Title +"\tAuthor : "+ Author+"\tPublisher : "+ Publisher+"\tFiction's Type : " +type + "\tBookId : "+BookId+"}");
		   }
}
