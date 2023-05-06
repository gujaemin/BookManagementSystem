package Book;

import java.util.Scanner;

public class Thriller extends Book {
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
	       
	       System.out.println("Type the book's Id : ");
	       int bookId = input.nextInt();
	       this.setBookId(bookId);
	       
	       
	   }


}
