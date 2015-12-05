import java.util.Scanner;

public class PrintNumbersIncreasingOrder4 {

	public static void main(String[] args) {
		System.out.println("Enter two different numbers:");
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		while(firstNum == secondNum){
			System.out.println("Please enter not-equal numbers:");
			firstNum = sc.nextInt();
			secondNum = sc.nextInt();
		}
		if(firstNum>secondNum){
			System.out.println(secondNum + ", " + firstNum);
		} else{
			System.out.println(firstNum + ", " + secondNum);
		}
	}

}
