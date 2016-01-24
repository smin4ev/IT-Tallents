
public class IndexOfMaxElementTest {

	public static int indexOfMaxElement(int[] array, int index) {
		if (index == array.length - 1) {
			return index;
		}
		int maxElementIndex = indexOfMaxElement(array, index + 1);
		if (array[index] > array[maxElementIndex]) {
			return index;
		} else {
			return maxElementIndex;
		}
	}

	public static void main(String[] args) {
		int[] array = {4,-2,5,6,12,4,0,9,23,6,7,8};
		int maxIndex = indexOfMaxElement(array, 0);
		System.out.println(maxIndex);
	}

}
