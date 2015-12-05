import java.util.Scanner;

public class SumOfASCIICodesOfTwoStrings4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two names in one string separated by a comma:");
		String twoNames = sc.nextLine();
		while(twoNames.contains(",") == false){
			System.out.println("Please enter comma for separation of two names:");
			twoNames = sc.nextLine();
		}
		int sumOfCodesInFirstName = 0;
		int sumOfCodesInSecondName = 0;
		String longerName;
		int i = 0;
		do{
			sumOfCodesInFirstName = sumOfCodesInFirstName + twoNames.charAt(i);
			i++;
		}
		while(twoNames.charAt(i) != ',');
		int endOfFirstName = i;
		i++;
		
		while(i<twoNames.length()){
			sumOfCodesInSecondName = sumOfCodesInSecondName + twoNames.charAt(i);
			i++;
		}
		if(sumOfCodesInFirstName > sumOfCodesInSecondName){
			longerName = twoNames.substring(0, endOfFirstName);
			System.out.println("Longer name is first name " + longerName);
		}
		if(sumOfCodesInFirstName<sumOfCodesInSecondName){
			longerName = twoNames.substring(endOfFirstName+1, twoNames.length());
			System.out.println("Longer name is second name " + longerName);
		}
		if(sumOfCodesInFirstName==sumOfCodesInSecondName){
			System.out.println("Sum of codes in two names are equal!");
			longerName = twoNames.substring(0, endOfFirstName) + "=" + twoNames.substring(endOfFirstName+1, twoNames.length());
			System.out.println(longerName);
		}
	}

}
