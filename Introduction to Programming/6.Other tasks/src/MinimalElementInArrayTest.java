
public class MinimalElementInArrayTest {

	public static int minElementInArray(int[]array, int index){
		if(index == 0){
			return array[index];
		}
		
		return Math.min(array[index], minElementInArray(array, index-1));
	}
	
	public static int maxElementInArray(int[]array, int index){
		if(index == 0){
			return array[index];
		}
		
		//return Math.max(array[index], maxElementInArray(array, index-1));
		if(array[index]>maxElementInArray(array, index-1)){
			return array[index];
		}
		else{
			return maxElementInArray(array, index-1);
		}
	}
	
	public static int difference(int[]array, int index){
		int max = maxElementInArray(array, index);
		int min = minElementInArray(array, index);
		int diff = max-min;
		return diff;
	}
	
	public static void bubbleSortRecursion(int[] array, int index){
		if(index == array.length-1){
			return;
		}
		for (int i = 0; i < array.length-1-index; i++) {
			if(array[i]>array[i+1]){
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
		bubbleSortRecursion(array, index+1);
	}
	
	public static int differ(int[] array, int index){
		bubbleSortRecursion(array, index);
		int max = array[array.length-1];
		int min = array[0];
		int result = max - min;
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] array = {1,5,4,6,0,-1,24};
		int index = 0;
		int diff= differ(array, index);
		System.out.println(diff);
//		int index = array.length-1;
//		int result = minElementInArray(array, index);
//		System.out.println(result);
//		int otherResult = maxElementInArray(array, index);
//		System.out.println(otherResult); 
//		int diff = difference(array, index);
//		System.out.println(diff);
		
		
	
	}

}
