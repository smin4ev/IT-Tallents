
public class SquareFromDigits20 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = i+1; j <=i+10; j++) {
				if(j>=10){
					System.out.print(j%10 + " ");
				}
				else{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

}
