
public class SelectionSortOptimization {

	public static void main(String[] args) {
		int[] array = {27,6,4,28,5,8,16};
		for (int i = 0; i < array.length/2; i++) {
			for (int j = i; j < array.length-1-i; j++) {
				if(array[j] > array[array.length-1-i]){
					int temp = array[array.length-1-i];
					array[array.length-1-i] = array[j];
					array[j] = temp;
				}
				else if(array[j]<array[i]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
//			for (int j = 0; j < array.length; j++) {
//				System.out.print(array[j] + " ");
//			}
//			System.out.println(); 
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
