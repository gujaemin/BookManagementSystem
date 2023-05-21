package Book;

import java.util.InputMismatchException;
import java.util.Scanner;
//Book 클래스를 상속, 인터페이스 BookInput 구현
public class Romance extends Book{
	   int RomanceType;
	   String type;
	   public Romance(BookKind kind) {
		   this.kind = kind;
	   }
	   //BookInput 인터페이스 메서드 구현
		public void getUserInput(Scanner input) {
			   
			   setBookTitle(input);
			   checkAuthorKnown(input);
		       setBookPublisher(input);
		       
		       System.out.println("Type the Romance's Type ");
		       System.out.println("1 : Historical Romance 2 : Contemporary Romance 3 : Paranormal Romance");
		       int romanceType = 0;
		       boolean isValidInput = false;

		       while (!isValidInput) {
		           try {
		               romanceType = input.nextInt();

		               switch (romanceType) {
		                   case 1:
		                       type = "Historical Romance";
		                       isValidInput = true;
		                       break;
		                   case 2:
		                       type = "Contemporary Romance";
		                       isValidInput = true;
		                       break;
		                   case 3:
		                       type = "Paranormal Romance";
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
		       System.out.println("Book{Kind : "+ skind +"\tTitle : " + Title +"\tAuthor : "+ Author+"\tPublisher : "+ Publisher+"\tRomance's Type : " +type + "\tBookId : "+BookId+"}");
			   }
	}