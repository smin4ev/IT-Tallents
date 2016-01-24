import java.util.Scanner;

public class SumOfNumbersInInterval6 {
	public static void main(String[] args){
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int counter = 0;
		if(number<1){
			for (int i = number; i <=1; i++) {
				counter = counter+i;
			}
		} else 
			if(number>=1){
				for(int i = 1; i<=number; i++){
					counter = counter+i;
				}
			}
		System.out.println(counter);
	}
}
