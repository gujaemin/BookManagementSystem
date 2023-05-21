import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManagement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManagement bookManagement = new BookManagement(input); // BookManagement 클래스 객체 선언
		int PW = 1234;
		System.out.println("Type the admin PW : ");
		int Pw = input.nextInt();
		if (Pw != PW) {
			System.out.println("Wrong Access."); // 패스워드가 일치하지 않으면 "Wrong Access." 출력하고 종료
			return;
		}
		selectMenu(input, bookManagement);
	}
	public static void selectMenu(Scanner input, BookManagement bookManagement ) {
		int num = -1;
		while (num != 5) { // num이 5가 아닐 때까지 반복
			try{
			    showMenu();
				
				num = input.nextInt(); // 사용자로부터 번호 입력받기
				switch(num) {
				case 1:
					bookManagement.addBooks();
					break;
				case 2:
					bookManagement.deleteBooks(); // 책 삭제 메소드 실행
					break;
				case 3:
					bookManagement.editBooks(); // 책 수정 메소드 실행
					break;
				case 4:
					bookManagement.viewBooks(); // 책 조회 메소드 실행
					break;
				default:
					continue;
			}
		}
			catch(InputMismatchException e){
				System.out.println("1~5사이의 값을 입력해주세요!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
			}
	}// while문 종료 (5를 선택한 경우)
	public static void showMenu() {
		System.out.println("### Book Management System Menu ###");
		System.out.println("1. Add books"); // 책 추가하기
		System.out.println("2. Delete books"); // 책 삭제하기
		System.out.println("3. Edit books"); // 책 수정하기
		System.out.println("4. View books"); // 책 조회하기
		System.out.println("5. Exit"); // 종료하기
		System.out.println("select one number between 1 to 5: ");
	}
}