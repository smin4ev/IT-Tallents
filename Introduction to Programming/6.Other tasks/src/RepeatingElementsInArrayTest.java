import javax.security.auth.Subject;

public class RepeatingElementsInArrayTest {

	static boolean repeatElements(int[] array){
		if(array.length==0){
			return false;
		}
		int[] helpArr = new int[array.length-1];
		for (int i = 1; i < array.length; i++) {
			if(array[0] == array[i]){
				return true;
			}
			else{
				helpArr[i-1] = array[i];
			}
		}
		return repeatElements(helpArr);
	}
	
	public static void main(String[] args) {
		int[] array = {2,3,4,2};
		boolean result = repeatElements(array);
		System.out.println(result);

	}

}
