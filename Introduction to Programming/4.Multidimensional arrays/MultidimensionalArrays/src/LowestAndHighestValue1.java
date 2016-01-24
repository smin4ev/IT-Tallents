
public class LowestAndHighestValue1 {
	public static void main(String[] args){
		int[][] array = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}
		};
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(array[i][j]<minValue){
					minValue = array[i][j];
				}
				if(array[i][j]>maxValue){
					maxValue = array[i][j];
				}
			}
		}
		System.out.println("Lowest element is:" + minValue);
		System.out.println("Highest element is:" + maxValue);
	}
}
