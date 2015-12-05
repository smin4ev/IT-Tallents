import java.util.Scanner;

public class SymbolInArray3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size >=1:");
		int arrSize = sc.nextInt();
		int counter = 0;
		while(arrSize<1){
			System.out.println("Please enter array size >=1");
			arrSize = sc.nextInt();
		}
		System.out.println("Enter a symbol for checking:");
		char symbol = sc.next().charAt(0);
		char[] array = new char[arrSize];
		System.out.println("Enter array of symbols:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < array.length; i++) {
			if(symbol == array[i]){
				counter++;
			}
		}
		if(counter == 0){
			System.out.println("This symbol does not exist in the array");
		}
		else
		if(counter == 1){
			System.out.println("This symbol exist in array on one place: ");
		}
		else{
			System.out.println("This symbol exist in array " + counter + " times!");
		}
	}

}
