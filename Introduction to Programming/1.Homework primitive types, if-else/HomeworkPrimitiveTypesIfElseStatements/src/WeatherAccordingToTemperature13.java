import java.util.Scanner;

public class WeatherAccordingToTemperature13 {

	public static void main(String[] args) {
		System.out.println("Enter a number in interval [-100;100]");
		Scanner sc = new Scanner(System.in);
		byte temperature = sc.nextByte();
		while(temperature<-100 || temperature>100){
			System.out.println("Temperature must be in interval[-100;100]. Enter valid value:");
			temperature = sc.nextByte();
		}
		if(temperature<=-20){
			System.out.println("Ice cold!");
		}else 
			if(temperature>-20 && temperature<=0){
			System.out.println("Cold!");
		}else 
			if(temperature>0 && temperature<=15){
			System.out.println("Coldly!");
		}else 
			if(temperature>15 && temperature<=25){
			System.out.println("Warm!");
		}else {
			System.out.println("Hot!");
		}
	}

}
