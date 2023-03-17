import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner temps = new Scanner(System.in); //Temps scanner 선언
		System.out.println("섭씨 온도로 바꿀 화씨온도를 입력하세요.");//섭씨온도를 묻는 문장 출력
		double tempF = temps.nextDouble();//double타입의 tempF를 temps를 이용해 읽는다
		
		double tempC = 5.0/9.0 * (tempF - 32);//받아낸 tempF로 tempC를 구한다.
		
		System.out.printf("변환된 섭씨온도는 %.2f °C ", tempC); //tempC값 출력
		
		temps.close();
	}

}


