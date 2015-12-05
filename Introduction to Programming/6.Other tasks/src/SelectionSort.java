
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {27,6,4,12,5,8,16};
		//int[] array = {33,90,14,26,67};
		//int[] array = {4,2,3,12,13,15,16}; масив, показващ, че може да има разместване до последно, тоест няма как да се сложи флаг
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {
				if(array[j]>array[array.length-1-i]){
					int temp = array[array.length-1-i];
					array[array.length-1-i] = array[j];
					array[j] = temp;
				}
			}
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j] + " ");
			}
			System.out.println();
		}
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}

	}

}
