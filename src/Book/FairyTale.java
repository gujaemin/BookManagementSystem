package Book;

import java.util.Scanner;

public class FairyTale extends Book implements BookInput{
	   int FairyTaleType;
	   String type;
	   public FairyTale(BookKind kind) {
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
	       
	       System.out.println("Type the FairyTale's Type ");
	       System.out.println("1 : Folktale 2 : Original Fairytales");
	       FairyTaleType = input.nextInt();
	       switch (FairyTaleType){
	       case 1 :
	    	   type = "Forktale";
	    	   break;
	       case 2 :
	    	   type = "Original Fairytales";
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
	       System.out.println("Book{Kind : "+ skind +"\tTitle : " + Title +"\tAuthor : "+ Author+"\tPublisher : "+ Publisher+"\tFairyTale's Type : " +type + "\tBookId : "+BookId+"}");
		   }	
	       
	   }

