import java.util.Scanner;

class ChangeThreeNumberValues6 {

	public static void main(String[] args) {
		System.out.println("Enter three number:");
	    Scanner sc = new Scanner(System.in);
	    int firstNum = sc.nextInt();
	    int secondNum = sc.nextInt();
	    int thirdNum = sc.nextInt();
	    
	    int tempNum = firstNum;
	    firstNum = secondNum;
	    secondNum = thirdNum;
	    thirdNum = tempNum;
	    
	    System.out.println("First number=" + firstNum + "; Second number=" + secondNum +
	    		"; Third number= " +thirdNum);
	    		
	}

}
