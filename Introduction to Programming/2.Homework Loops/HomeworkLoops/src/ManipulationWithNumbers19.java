import java.util.Scanner;

public class ManipulationWithNumbers19 {

	public static void main(String[] args) {
		System.out.println("Enter a number in interval [10;99]");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
	
		while(number<10 || number>99){
			System.out.println("Please enter number in interval [10;99]");
			number = sc.nextInt();
		}
		while(number != 1){
			if(number%2 == 0){
				number = (int) (number*0.5);
			}
			else{
				number = number*3 +1 ;
			}
			System.out.print(number + " ");
		}
	}

}
