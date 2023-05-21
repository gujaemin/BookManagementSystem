package Book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FairyTale extends Book{
	   int FairyTaleType;
	   String type;
	   public FairyTale(BookKind kind) {
		   this.kind = kind;
	   }	   
	public void getUserInput(Scanner input) {
		   setBookTitle(input);
	       checkAuthorKnown(input);
           setBookPublisher(input);
           System.out.println("Type the FairyTale's Type ");
           System.out.println("1 : Folktale 2 : Original Fairytales");

           int fairyTaleType = 0;
           boolean isValidInput = false;

           while (!isValidInput) {
               try {
                   fairyTaleType = input.nextInt();

                   switch (fairyTaleType) {
                       case 1:
                           type = "FolkTale";
                           isValidInput = true;
                           break;
                       case 2:
                           type = "Original Fairytales";
                           isValidInput = true;
                           break;
                       default:
                           System.out.println("Invalid input. Please enter a value between 1 and 2.");
                           break;
                   }
               } catch (InputMismatchException e) {
                   System.out.println("Invalid input. Please enter a valid integer.");
                   input.nextLine(); // Clear the input buffer
                   continue;
               }
           }


	       
	       setBookId(input);
	       

	     }
	  public void printInfo() {
		   String skind = getKindString();
	       System.out.println("Book{Kind : "+ skind +"\tTitle : " + Title +"\tAuthor : "+ Author+"\tPublisher : "+ Publisher+"\tFairyTale's Type : " +type + "\tBookId : "+BookId+"}");
		   }

	 }

