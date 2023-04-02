import java.util.Scanner;
import java.time.LocalDate;
import java.time.ZoneId;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
		while (num != 6){
			System.out.println("1. Add books");//책 추가
			System.out.println("2. Delete books");//책 삭제
			System.out.println("3. Edit books");//책 편집
			System.out.println("4. View books");//책 보기
			System.out.println("5. Show a Menu");//메뉴 보여주기
			System.out.println("6. EXIT");//종료(나가기)
			System.out.println("Select one number between 1 - 6");
			num = input.nextInt();
			if(num == 1) {
				addStudent();
			}
			else if(num ==2) {
				Deletebooks();
			}
			else if(num == 3) {
				Editbooks();
			}
			else if(num ==4) {
				Viewbooks();
			}
			else {
				continue;
			}
			
		}	
	}
	public static void addStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID");
		int StudentID = input.nextInt();
		System.out.print("Book's name");
		input.nextLine();
	    String Bookname = input.nextLine();
		System.out.print("Book's ID");
		int BookID = input.nextInt();
		System.out.print("Today's day");
		String Day = input.next();
	}
	public static void Deletebooks() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID");
		int StudentID = input.nextInt();
}
	public static void Editbooks() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID");
		int StudentID = input.nextInt();
}
	public static void Viewbooks() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID");
		int StudentID = input.nextInt();
}

}
