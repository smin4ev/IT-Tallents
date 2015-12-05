
public class MostCommonNumberInArray10 {

	public static void main(String[] args) {
		int[] array = {4, 4, 1, 4, 2, 3,4, 4, 1, 2, 4, 9, 3};
		int curCounter = 1;
		int mostCounter = 1;
		int number = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]){
					curCounter++;
				}
			}
			if(curCounter>mostCounter){
				mostCounter = curCounter;
				number = array[i];
			}
			curCounter=1;
		}
		System.out.println("Most common number is " + number + "-" + mostCounter + " times");
	}

}
