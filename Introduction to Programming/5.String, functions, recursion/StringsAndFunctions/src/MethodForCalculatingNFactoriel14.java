import java.util.Scanner;

public class MethodForCalculatingNFactoriel14 {

	public static int factorielWithRecursion(int number){
		if(number == 1){
			return 1;
		}
		return number*factorielWithRecursion(number-1);
	}
	
	
	//Метод за факториел със цикъл
//	public static int factorielWithCycle(int number){
//		int result = 1;
//		for(int i = number; i>=1; i--){
//			result = result*i;
//		}
//		return result;
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int result = factorielWithRecursion(num);
		System.out.println("Result of " + num +"! is " + result);

	}

}
