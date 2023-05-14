import java.util.Scanner;

public class MenuManagement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManagement bookManagement = new BookManagement(input); // BookManagement 클래스 객체 선언
		int num = 0;
		int PW = 1234;
		System.out.println("Type the admin PW : ");
		int Pw = input.nextInt();
		
		if (Pw != PW) {
			System.out.println("Wrong Access."); // 패스워드가 일치하지 않으면 "Wrong Access." 출력하고 종료
			return;
		}
		
		while (num != 5) { // num이 5가 아닐 때까지 반복
			System.out.println("### Book Management System Menu ###");
			System.out.println("1. Add books"); // 책 추가하기
			System.out.println("2. Delete books"); // 책 삭제하기
			System.out.println("3. Edit books"); // 책 수정하기
			System.out.println("4. View books"); // 책 조회하기
			System.out.println("5. Exit"); // 종료하기
			System.out.println("select one number between 1 to 5: ");
			num = input.nextInt(); // 사용자로부터 번호 입력받기

			if (num == 1) { // 1을 선택한 경우
				bookManagement.addBooks(); // 책 추가 메소드 실행
			} else if (num == 2) { // 2를 선택한 경우
				bookManagement.deleteBooks(); // 책 삭제 메소드 실행
			} else if (num == 3) { // 3을 선택한 경우
					bookManagement.editBooks(); // 책 수정 메소드 실행
			} else if (num == 4) { // 4를 선택한 경우
					bookManagement.viewBooks(); // 책 조회 메소드 실행
			} else { // 1~5 이외의 다른 번호를 선택한 경우
					continue; // 다시 반복문 처음으로 돌아가기
			}
		} // while문 종료 (5를 선택한 경우)
	}
}