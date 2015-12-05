import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.FieldBorder;

public class Factoriel {

	public static long productOfNumbers(int num){
		if(num <= 1){
			return 1;
		}
		return num*productOfNumbers(num-1);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		long result = productOfNumbers(number);
		System.out.println(result);
		
	}

}
