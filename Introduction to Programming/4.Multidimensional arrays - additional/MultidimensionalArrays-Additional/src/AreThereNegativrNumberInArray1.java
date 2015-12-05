import java.util.Scanner;

public class AreThereNegativrNumberInArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[3][3];
		boolean flag = true;
		System.out.println("Enter elements of array");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(array[i][j]<0){
					flag = false;
					break;
				}
			}
			if(flag == false){
				System.out.println("There is at least one negative number in array!");
				break;
			}
		}
		if(flag == true){
			System.out.println("All numbers are positive!");
		}
	}

}
