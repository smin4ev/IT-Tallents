import java.util.Scanner;

public class PeriodOfTheDay15 {

	public static void main(String[] args) {
		System.out.println("Enter a number(hour) in interval [0;24]");
		Scanner sc = new Scanner(System.in);
		byte number = sc.nextByte();
		while(number<0 || number>24){
			System.out.println("Please enter number in interval [0;24]:");
			number = sc.nextByte();
		}
		if((18<=number && number <=24) || (number>=0 && number <4)){
			System.out.println("����� �����!");
		}else 
			if( 4<=number && number<9){
			System.out.println("����� ����!");
		}else{
			System.out.println("����� ���!");
		}

	}

}
