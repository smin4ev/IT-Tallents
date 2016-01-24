
public class RotateElementsOfArrayOn90Degrees4 {

	public static void main(String[] args) {
		int[][] array = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
//		for (int i = 0; i < array.length; i++) {
//			for (int j = array[0].length-1; j >= 0; j--) {
//				System.out.print(array[j][i] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println();
		for (int j = 0; j < array[0].length; j++) {
			for (int i = array.length-1; i >= 0; i--) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
