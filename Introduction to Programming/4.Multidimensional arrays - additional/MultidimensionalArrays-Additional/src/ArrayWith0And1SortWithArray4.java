import java.util.Arrays;

public class ArrayWith0And1SortWithArray4 {

	public static void main(String[] args) {
		int[] array = {1,0,0,0,1,0,0,1,1};
		int counter0 = 0;
		int counter1 = 0;
		//Решение директно със сортиране
//		Arrays.sort(array);
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
		
		//Стандартно решение с преброяване на нули и единици от масива и два цикъла
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 0){
				counter0 ++;
			}
			if(array[i] == 1){
				counter1++;
			}
		}
		for (int i = 0; i < counter0; i++) {
			array[i] = 0;
		}
		for (int i = counter0; i < array.length; i++) {
			array[i] = 1;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		
		//МЕГА ЯКОТО решение с преподреждане на цифрите в масива
//		int temp = 0;
//		int counter = 0;
//		
//		for (int i = 0; i < array.length; i++) {
//			temp = array[i];
//			while(temp == 1 && counter<array.length){
//				counter++;
//				for (int j = i; j < array.length-1; j++) {
//					array[j] = array[j+1];
//					//System.out.print(array[j] + "");
//				}
//				array[array.length-1] = temp;
//				//System.out.print(array[array.length-1]);
//				temp = array[i];
//				//System.out.println();
//			}
//		}
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
	}

}
