import java.util.Scanner;

public class ChessCoordinates14 {

	public static void main(String[] args) {
		System.out.println("Please enter 4 digit in interval [1;8]");
		Scanner sc = new Scanner(System.in);
		byte f = sc.nextByte();
		byte s = sc.nextByte();
		byte t = sc.nextByte();
		byte fo = sc.nextByte();
		while (f<1 || f>8 || s<1 || s>8 || t<1 || t>8 || fo<1 || fo>8  ){
			System.out.println("Every one digit must be in interval [1;8]. Please enter valid coordinates");
			f = sc.nextByte();
			s = sc.nextByte();
			t = sc.nextByte();
			fo = sc.nextByte();
		}
		System.out.println("To be fields with same color, sum of coordinates of each "
				+ "field must be either odd or even, but not different");
		byte sumOfCoordinatesOfFirstField = (byte) (f+s);
		byte sumOfCoordinatesOfSecondField = (byte) (t+fo);
		if((sumOfCoordinatesOfFirstField%2) == (sumOfCoordinatesOfSecondField%2)){
			System.out.println("Fields are with same color!");
		}else{
			System.out.println("Fields are with different color!");
		}
	}

}
