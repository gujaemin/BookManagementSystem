import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Assignment3 {
	
	public static void main(String[]args) {
		int randomNum = ThreadLocalRandom.current().nextInt(0,2);
		Scanner inputNum = new Scanner(System.in);
		System.out.println("randomNum이 0일 때 H, 1일 때 T");
		
		while (true) {
			System.out.println("H or T :");
			String userinput = inputNum.nextLine();
			if(userinput.equals("H")) {
				if(randomNum == 0) {
					System.out.println("Coreect!");
					
				}
				else if(randomNum == 1){
					System.out.println("Incorrect!");
					System.out.println("The result of Coin Toss is T");
				}
			}
			else if(userinput.equals("T")){
				if(randomNum == 0) {
					System.out.println("Incorrect!");
					System.out.println("The result of Coin Toss is H");
				}
				else if(randomNum == 1) {
					System.out.println("Correct!");
					
				}
				}
			else {
				System.out.println("Please input H or T");
			}
		break;
			
			}

	}
}
