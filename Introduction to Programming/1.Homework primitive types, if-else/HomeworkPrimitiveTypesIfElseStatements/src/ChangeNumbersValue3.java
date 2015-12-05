import java.util.Scanner;

public class ChangeNumbersValue3 {

	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		int tempNum = firstNum;
		firstNum = secondNum;
		secondNum = tempNum;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
	}

}
