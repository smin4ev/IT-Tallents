import java.util.Scanner;

public class FunctionIsNumberCube6 {

	public static void isNumberCube(int number){
		boolean isCube = false;
		for(int i = 1; i<=Math.sqrt(number); i++){
			if(number%i==0){
				int temp = number/i;
				if(i*i == temp){
					System.out.println(number+ " is a cube of " + i);
					isCube = true;
					break;
				}
			}
		}
		if(isCube == false){
			System.out.println(number+ " is not a cube");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		isNumberCube(number);
	}

}
