import java.util.Scanner;

public class MultiplicationTable18 {

	public static void main(String[] args) {
		System.out.println("Enter two numbers in interval [1;9]");
		Scanner sc = new Scanner(System.in);
		
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		while(firstNum<1 || firstNum>9 || secondNum<1 || secondNum>9){
			System.out.println("Please enter numbers in interval [1;9]");
			firstNum = sc.nextInt();
			secondNum = sc.nextInt();
		}
		for (int i = 1; i <= firstNum ; i++) {
			for (int j = 1; j <= secondNum; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
	}

}
