import java.util.Arrays;

public class QuickSort {

	public static int partition(int[] array, int l, int r) {
		//със следващите 4 реда избираме случаен елемент от масива и го разменяме с последния
		//по този начин pivot-a(последният елемент) е избран случайно и дава най-голяма вероятност 
		//в средния случай алгоритъмът да се изпълни NlgN
		int randomIndex = (int)(Math.random()*(r-l)+l);
		int temp = array[r];
		array[r] = array[randomIndex];
		array[randomIndex] = temp;
		
		int k = l-1;
		int pivot = array[r];
		for(int i =l; i <= r; i++){
			if(array[i]<=pivot){
				k++;
				temp = array[i];
				array[i] = array[k];
				array[k] = temp;
			}
		}
		return k;
	}
	
	static void quickSort(int[] a, int l, int r ){
		if(l>=r){
			return;
		}
		
		int k = partition(a,l,r);
		quickSort(a,l,k-1);
		quickSort(a, k+1,r);
	}
	
	public static void main(String[] args) {
		int[] array = {4,7,2,1,3,11,9,8,0,-1,5};
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
		
	}

}
