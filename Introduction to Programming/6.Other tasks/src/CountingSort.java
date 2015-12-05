import java.util.Arrays;

public class CountingSort {

	public static int[] countingSort(int[] array){
		       //намираме най-големия елемент в масива
				int maxElement = array[0];
				int minElement = array[0];
				for(int i = 0; i<array.length; i++){
					if(array[i]>maxElement){
						maxElement = array[i];
					}
					//търсим най-малкия елемент, за да може да работи и с отрицателни числа
					//ако не го използваме, ще работи само с положителни
					if(array[i]<minElement){
						minElement = array[i];
					}
				}
				minElement = minElement*(-1);
				//към всеки елемент на масива прибавяме минималния елемент - така най-малкият ще е 0
				for (int i = 0; i < array.length; i++) {
					array[i] = array[i]+minElement;
				}
				
				//създаваме помощен масив с големина най-големия елемент+1
				int[] helpArray = new int[maxElement+1];
				//запълваме помощния масив, като за индекси се ползват стойностите от началния масив
				for (int i = 0; i < array.length; i++) {
					int currentNum = array[i];
					helpArray[currentNum]++;
				}
				//създавеме си нов масив с големина началния(може да се ползва и началния)
				int[] resultArray = new int[array.length];
				int counter = 0;
				for (int i = 0; i < helpArray.length; i++) {
					while(helpArray[i]>0){
						resultArray[counter] = i-minElement;//от всеки елемент вадим минималния за да върнем началната му стойност
						counter++;
						helpArray[i]--;
					}
				}
				return resultArray;
						
	}
	
	public static void main(String[] args) {
		int[] array = {1,1,2,3,1,32,2,1,3,2};
		array = countingSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
