import java.util.Scanner;

public class NumbersInInterval5 {
	public static void main(String[] args){
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		if(firstNum>secondNum){
			for(int i = secondNum; i<=firstNum; i++){
				System.out.print(i + ",");
			}
		} else 
			if(firstNum<secondNum){
				for (int i = firstNum; i <=secondNum; i++) {
					System.out.print(i + ",");
				}
			} else{
				System.out.println(firstNum + " Two numbers are equal");
			}
		
		}  
}

