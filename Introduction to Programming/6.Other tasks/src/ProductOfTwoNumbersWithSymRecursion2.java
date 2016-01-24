import java.util.Scanner;

public class ProductOfTwoNumbersWithSymRecursion2 {
	
	public static int product(int a, int b){
		if(a==2 ){
			return b+b;
		}
		return product(a-1, b) +b ;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = product(a,b);
		System.out.println("Product of numbers is:");
		System.out.println(result);
	}
}
