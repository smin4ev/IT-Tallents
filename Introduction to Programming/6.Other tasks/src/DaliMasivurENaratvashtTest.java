
public class DaliMasivurENaratvashtTest {

	public static boolean isNarastvasht(int[] array){
		if(array.length == 0){
			return true;
		}
		int[] helpArray = new int[array.length-1];
		for (int i = 1; i < helpArray.length; i++) {
			if(array[0]>=array[1]){
				return false;
			}
			else{
				helpArray[i-1] = array[i];
			}
		}
		return isNarastvasht(helpArray);
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		boolean result = isNarastvasht(array);
		System.out.println(result);
	}

}
