import java.util.Scanner;

public class NumberOnPowerWithRecursion7 {
	public static int product(int a, int b){
		if(a==1 ){
			return b;
		}
		return product(a-1, b) +b ;
	}

	public static long numberOnPower(int x, int y){
		if(y==0){
			return 1;
		}
		int z = x-1;
		//return numberOnPower(x, y-1)*z  ;  //«а решение без метода product, но има умножение
		
		return (long) (numberOnPower(x, y-1) + product((z),(int)(numberOnPower(x, y-1))));
		//return product(x, numberOnPower(x, y-1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for number and power:");
		int number = sc.nextInt();
		int power = sc.nextInt();
		long result = numberOnPower(number, power);
		System.out.println(result);
		
	}

}
