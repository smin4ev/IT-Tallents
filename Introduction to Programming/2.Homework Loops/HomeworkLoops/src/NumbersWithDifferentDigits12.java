
public class NumbersWithDifferentDigits12 {
	public static void main(String[] args){
		
		for (int i = 100; i < 1000; i++) {
			int firstNum = i/100;
			int secondNum = (i/10)%10;
			int thirdNum = i%10;
			
			if((firstNum != secondNum) && (secondNum != thirdNum) && (firstNum !=thirdNum)){
				System.out.print(i + ",");
			}
		}
			
	}
}
