
public class Task10 {

	static void extremum(int[] array){
		boolean isPeakInTheEnd = true;
		boolean isDepthInTheEnd = true;
		for (int i = 1; i < array.length-1; i++) {
			if(array[i]>=array[i-1] && array[i]>array[i+1]){
				System.out.println(i+"(хълм)");
				return;
			}
			if(array[i]<array[i-1] && array[i]< array[i+1]){
					System.out.println(i + "(падина)");
					return;
				} 
			if(array[i-1]>array[i]){
				isPeakInTheEnd = false;
			}
			if(array[i-1]<array[i]){
				isDepthInTheEnd = false;
			}
		}
		if(isPeakInTheEnd == true){
			System.out.println(array.length-1 + "(хълм)");
		}
		if(isDepthInTheEnd == true){
			System.out.println(array.length-1 + "(падина)");
		}
	}
	
	public static void main(String[] args) {
		int[] array = {14,13,12,11,10,11};
		extremum(array);
	}

}
