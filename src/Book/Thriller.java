package Book;

import java.util.Scanner;

public class Thriller extends Book {
	   int ThrillerType;
	   String type;
	   public Thriller(BookKind kind) {
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
	       
	       System.out.println("Type the Thriller's Type ");
	       System.out.println("1 : Psychological Thriller 2 : Crime Thriller 3 : Supernatural Thriller");
	       ThrillerType = input.nextInt();
	       switch (ThrillerType){
	       case 1 :
	    	   type = "Psychological Thriller";
	    	   break;
	       case 2 :
	    	   type = "Crime Thriller";
	    	   break;
	       case 3 :
	    	   type = "Supernatural Thriller";
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
	       System.out.println("Book{Kind : "+ skind +"\tTitle : " + Title +"\tAuthor : "+ Author+"\tPublisher : "+ Publisher+"\tThriller's Type : " +type + "\tBookId : "+BookId+"}");
		   }	
}
