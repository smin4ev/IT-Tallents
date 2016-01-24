
public class NumberOnPowerWithRecursionSecond {
	
	public static int multWithSum(int a, int b){
		if(b==1){
			return a;
		}
		return multWithSum(a, b-1) + a;
	}
	
	public static int power(int x, int y){
		if(y==0){
			return 1;
		}
		if(y==1){
			return x;
		}
		
		//return x*power(x, y-1);
		return multWithSum(x,power(x, y-1));
		//return product(x, numberOnPower(x, y-1));
	}
	
	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int result = power(a, b);
		System.out.println(result);
		

	}

}
