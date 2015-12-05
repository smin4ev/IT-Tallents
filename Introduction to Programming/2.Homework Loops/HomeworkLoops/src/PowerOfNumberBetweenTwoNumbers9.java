import java.util.Scanner;

public class PowerOfNumberBetweenTwoNumbers9 {

	public static void main(String[] args) {
		System.out.println("Enter two positive numbers. Please second number to be bigger than first!");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int sumOfNumbers = 0;
        while(firstNum>=secondNum || firstNum<=0 || secondNum<=0){
        	System.out.println("Please enter a new number according task requirements:");
        	firstNum = sc.nextInt();
        	secondNum = sc.nextInt();
        }
        for (int i = firstNum; i <= secondNum; i++) {
        	int nextNum = i*i;
        	if(nextNum%3 == 0){
        		System.out.print("skip 3,");
        	}
        	else{
			System.out.print(nextNum + ",");
			sumOfNumbers = sumOfNumbers+nextNum;
        	}
        	if(sumOfNumbers>200){
        		System.out.print(" Sum of numbers became " + sumOfNumbers + " and we must stop "
        				+ "program execution!");
        		break;
        	}
		}
	}

}
