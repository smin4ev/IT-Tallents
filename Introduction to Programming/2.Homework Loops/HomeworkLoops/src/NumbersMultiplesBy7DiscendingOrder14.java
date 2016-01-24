import java.util.Scanner;

public class NumbersMultiplesBy7DiscendingOrder14 {
	public static void main(String[] args){
		System.out.println("Enter a number in interval [10;200]");
		Scanner sc = new Scanner(System.in);
		int startNum = sc.nextInt();
		while(startNum<10 || startNum>200){
			System.out.println("Please enter a number according task requirements:");
			startNum = sc.nextInt();
		}
		
		for(int i = startNum; i>=10; i--){
			if(i%7 == 0){
				System.out.print(i+" ");
			}
		}
		
	}
}
