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
			
			switch(num) {
			case 1:
				System.out.println("Type your student ID :");//책을 빌릴 학생의 ID
				int StudentID = input.nextInt();
				System.out.println("Type your book's title :");//빌릴 책 이름
				String booktitle = input.next();
				System.out.println("Type your book's ID :");//빌릴 책의 ID
				String bookID = input.next();
				System.out.println("Enter today's day");//책을 빌릴 오늘의 요일
				String date = input.next();
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("Student ID :");
				int StudentID2 = input.nextInt();
		}
	}
	}
}
