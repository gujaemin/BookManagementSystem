package Book;

import java.util.Scanner;

public class Romance extends Book implements BookInput {
	   int RomanceType;
	   String type;
	   public Romance(BookKind kind) {
		   this.kind = kind;
	   }
		public void getUserInput(Scanner input) {
			   
			   System.out.println("Type the book's Title : ");
		       String title = input.next();
		       this.setTitle(title);
		       
		       char answer = 'x';
		       while(answer !=  'y' && answer != 'Y' && answer !=  'n' && answer != 'N') 
		       {
		    	   System.out.println("Is the author of this book known? (Y/N)");
		    	   answer = input.next().charAt(0);
		    	   if(answer == 'y' || answer == 'Y') {
		    		   System.out.println("Type the book's Author : ");
		    		   String author = input.next();
		    		   this.setAuthor(author);
		    		   break;
		    	   }
		    	   else if (answer == 'n' || answer == 'N') {
		    		   this.setAuthor("");
		    		   break;
		    	   }
		    	   else {
		    	   
		       }
		       }
		       System.out.println("Type the book's Publisher : ");
		       String publisher = input.next();
		       this.setPublisher(publisher);
		       
		       System.out.println("Type the Fiction's Type ");
		       System.out.println("1 : Historical Romance 2 : Contemporary Romance 3 : Paranormal Romance");
		       RomanceType = input.nextInt();
		       switch (RomanceType){
		       case 1 :
		    	   type = "Historical Romance";
		    	   break;
		       case 2 :
		    	   type = "Contemporary Romance";
		    	   break;
		       case 3 :
		    	   type = "Paranormal Romance";
		    	   break;
		       default :
		       }
		       
		       System.out.println("Type the book's Id : ");
		       int bookId = input.nextInt();
		       this.setBookId(bookId);
	   
		   }
		 public void printInfo() {
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
		       System.out.println("Book{Kind : "+ skind +"\tTitle : " + Title +"\tAuthor : "+ Author+"\tPublisher : "+ Publisher+"\tRomance's Type : " +type + "\tBookId : "+BookId+"}");
			   }	

	}