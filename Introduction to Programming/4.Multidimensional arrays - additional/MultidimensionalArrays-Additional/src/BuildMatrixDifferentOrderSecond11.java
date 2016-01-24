import java.util.Scanner;

public class BuildMatrixDifferentOrderSecond11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive numbers for matrix size:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		while(row<1 || col<1){
			System.out.println("Please enter positive numbers:");
			row = sc.nextInt();
			col = sc.nextInt();
		}
		int [][] array = new int[row][col];
		int valueInArray = 1;
		int temp = 1;
		
		//За да не излизаме извън границите на циклите, трябва да се завъртат в обратна
		//последователност от стандартния си вид - j ще отговаря за редовете, затова ще
		//се върти до array.length, а i ще отговаря за колоните, за това ще се върти до
		//array[0].length
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = valueInArray++;
			}
		}
		
		//Второ решение със стандартно разположение на i и j, но с увеличаване на стойността
		//с +4 за всяка следваща стойност и връщане на стойността за началото на всеки нов ред
//		for (int i = 0; i < array.length; i++) {
//			valueInArray = temp;
//			for (int j = 0; j < array[i].length; j++) {
//				array[i][j] = valueInArray;
//				valueInArray = valueInArray+4;
//			}
//			temp++;
//		}
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
