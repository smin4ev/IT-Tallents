import java.util.Scanner;

public class MaxSumOfThreeElementsInArray15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float fNum = 0;
		float sNum = 0;
		float tNum = 0;
		System.out.println("Enter size of array > 1:");
		int arrSize = sc.nextInt();
		while(arrSize<1){
			System.out.println("Array size must be > 1.Please enter valid value:");
			arrSize = sc.nextInt();
		}
		
		 float[] array = new float[arrSize];
		 System.out.println("Enter elements of the array:");
		 for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextFloat();
		}
		 for (int i = 0; i < array.length-2; i++) {
			for (int j = i+1; j < array.length-1; j++) {
				for (int z = j+1; z < array.length; z++) {
					if((Math.abs(array[i]) + Math.abs(array[j]) + Math.abs(array[z]) 
						> Math.abs(fNum) + Math.abs(sNum) + Math.abs(tNum))){
						fNum = array[i];
						sNum = array[j];
						tNum = array[z];
					}
				}
			}
		}
		 System.out.print("Elements with biggest sum with their absolute values are: ");
		 System.out.print(fNum + " " + sNum + " " + tNum);
	}

}
