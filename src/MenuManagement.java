import java.util.Scanner;
public class MenuManagement {
	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      BookManagement bookManagement = new BookManagement(input);//BookManagement 클래스 객체 선언
	      int num = 0;
	      int PW = 1234;
	      System.out.println("Type the admin PW : ");
	      int Pw= input.nextInt();
	      if (Pw!=PW) {
	         System.out.println("Wrong Access.");
	         return;
	         
	      }//패스워드를 통해 입장
	      
	      
	      while (num !=5) {
	         System.out.println("### Book Management System Menu ###");
	         System.out.println("1. Add books");
	         System.out.println("2. Delete books");
	         System.out.println("3. Edit books");
	         System.out.println("4. View books");
	         System.out.println("5. Exit");
	         System.out.println("select one number between 1 to 5: ");
	         num = input.nextInt();
	               
	         if (num==1){               
	            bookManagement.addBooks();   
	         }
	         else if(num==2) {
	            bookManagement.deleteBooks();
	         }
	         else if(num==3) {
	            bookManagement.editBooks();
	         }
	         else if(num==4) {
	            bookManagement.viewBooks();
	         }
	         else {
	            continue;
	         }
	      }//어떤 항목 고를지 결정
	   }
	      
	      

	}