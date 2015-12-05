import java.util.Scanner;

public class NumbersInRowWithRecursion4 {
	static int counter = 0;
	public static void numbersInRow(int start, int end){
		if(start > end){
			return;
		}
		for (int i = 0; i <= counter; i++) {
			System.out.print(start+i+ " ");
		}
		counter++;
		System.out.println();
		numbersInRow(start, end-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for start and final ot rows (endNum>startNum)");
		int startNum = sc.nextInt();
		int endNum = sc.nextInt();
		while(endNum<startNum){
			System.out.println("endNum must be > startNum!");
			startNum = sc.nextInt();
			endNum = sc.nextInt();
		}
		numbersInRow(startNum, endNum);
		
		
	}

}
