import java.util.Scanner;

public class NumbersMultiplesBy50DiscendingOrder16 {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers in interval [10;5555]");
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int tempNum;
		
		while(firstNum<10 || firstNum>5555 || secondNum<10 || secondNum>5555){
			System.out.println("Please enter a numbers according task requirements:");
			firstNum = sc.nextInt();
			secondNum = sc.nextInt();
		}
		if(firstNum<secondNum){
			tempNum = firstNum;
			firstNum = secondNum;
			secondNum = tempNum;
		}
		
			for(int i = firstNum; i>=secondNum; i--){
				if(i%50 == 0){
					System.out.print(i + " ");
				}
			
			}
	}

}
