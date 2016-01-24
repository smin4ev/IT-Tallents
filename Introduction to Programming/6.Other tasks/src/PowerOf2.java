import java.util.Scanner;

public class PowerOf2 {

	public static int powerOf2(int x){
		if(x <=0 ){
			return 1;
		}
		return 2*powerOf2(x-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter power:");
		int y = sc.nextInt();
		int result = powerOf2(y);
		System.out.println(result);
		
		
	}

}
