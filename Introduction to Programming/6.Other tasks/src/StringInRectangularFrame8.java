
public class StringInRectangularFrame8 {
	
	public static void stringRectangular(String[] array){
		int longestStr = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i].length() >longestStr){
				longestStr = array[i].length();
			}
		}
		for (int i = 0; i < longestStr+2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print("*"+array[i]);
			int difference = longestStr - array[i].length();
			for (int j = 0; j < difference; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for (int i = 0; i < longestStr+2; i++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args){
		String[] b = {"Hello", "I", "am", "happy", "and", "alabala", "t", "r", "teeeeeeeesr"};
		stringRectangular(b);
	}
}
