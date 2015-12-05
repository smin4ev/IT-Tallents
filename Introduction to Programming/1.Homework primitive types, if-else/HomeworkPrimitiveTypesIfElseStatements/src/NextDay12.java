import java.util.Scanner;

public class NextDay12 {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers for day, month and year:");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		while(year<0){
			System.out.println("Please enter valid value for year:");
			year = sc.nextInt();
		}
		
		while(day<0 || day>31){
			System.out.println("Please enter valid value for day:");
			day = sc.nextInt();
		}
		
		while(month<0 || month>12){
			System.out.println("Please enter valid value for month<=12:");
			month = sc.nextInt();
		}
		if(month == 4 || month == 6 || month == 9 || month == 11 ){
			while(day>30){
				System.out.println("Please enter valid day<=30:");
				day = sc.nextInt();
			}	
		}else 
			if((month == 2)  && (year%400 == 0)){
		     while(day>29){
		    	 System.out.println("Please enter valid day<=29:");
		    	 day = sc.nextInt();
		     }
		}else 
			if((month == 2) && (year%4 == 0) && (year%100!=0)){
			while(day>29){
				System.out.println("Please enter valid day<=29:");
				day = sc.nextInt();
			}
		}else 
			if((month == 2) && (year%100) == 0){
			while(day>28){
				System.out.println("Please enter valid day<=28:");
				day = sc.nextInt();
			}
		}else 
			if((month == 2) && (year%4 != 0)){
			while(day>28){
			System.out.println("Please enter valid day <=28");
			day = sc.nextInt();
			}
		}else{
			while(day>31){
			System.out.println("Please enter valid day <=31!!!");
			day = sc.nextInt();
			}
		}
		
		if((month == 4 || month == 6 || month==9 || month==11) && day==30){
			month++;
			day = 1;
		}else 
			if(month==2 && year%400==0 && day==29){
			month++;
			day=1;
		}else 
			if(month==2 && year%4==0 && year%100 !=0 && day==29){
			month++;
			day=1;
		}else 
			if(month==2 && year%100==0 && year%400 !=0 && day==28){
			month++;
			day = 1;
		}else 
			if(month==2 && year%4 !=0 && day==28){
			month++;
			day=1;
		}else 
			if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10) && day==31){
			month++;
			day=1;
		}else 
			if(month==12 && day==31){
			month=1;
			day=1;
			year++;
		}else{
			day++;
		}
		System.out.println("Next day is - " + day + ", month - " + month + ", year - " + year);	
	}
}	


