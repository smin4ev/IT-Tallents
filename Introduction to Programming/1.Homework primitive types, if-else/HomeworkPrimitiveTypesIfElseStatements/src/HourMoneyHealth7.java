import java.util.Scanner;

public class HourMoneyHealth7 {

	public static void main(String[] args) {
		System.out.println("Enter a hour:");
	    Scanner sc = new Scanner(System.in);
	    int hour = sc.nextInt();
	    while(hour<0 || hour>24){
	    	System.out.println("Enter a valid value for hour:");
	    	hour = sc.nextInt();
	    }
	    System.out.println("Enter money:");
	    float money = sc.nextFloat();
	    while(money<0){
	    	System.out.println("Enter a valid value for money:");
	    	money = sc.nextFloat();
	    }
	    System.out.println("Enter your health status - true or false:");
	    boolean isHealthy = sc.nextBoolean();
	    float enoughMoneyforMedicine = 20.50f;
	    if(isHealthy == false){
	    	System.out.println("I will not go out!");
	    } else {
	    	System.out.println("I will go to cinema with friends!");
	    }
	    if(money>=enoughMoneyforMedicine){
	    	System.out.println("I will buy a medicines!");
	    } else {
	    	System.out.println("I will stay at home and drink tea!");
	    }
	    if(money<10){
	    	System.out.println("I will go to the cafe!");
	    }
	    

	}

}
