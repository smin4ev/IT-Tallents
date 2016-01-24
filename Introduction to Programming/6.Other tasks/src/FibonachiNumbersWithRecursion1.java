import java.util.Scanner;

public class FibonachiNumbersWithRecursion1 {

	public static int fibonachiRecursion(int n){
		if(n==0){
			return 0;
		}
		if(n==1 || n==2){
			return 1;
		}
		else{
		return fibonachiRecursion(n-1) + fibonachiRecursion(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = fibonachiRecursion(number);
		System.out.println(result);
		
		
	}

}
