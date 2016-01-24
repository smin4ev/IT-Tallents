
public class ProductOfElementsUnderMainDiagonal7 {

	public static void main(String[] args) {
		int[][] array = {
				{12,34,16,65},
				{24,91,19,16},
				{27,12,92,51},
				{28,21,10,46},
		}; 
		int productOfNumbers = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(i>j){
					productOfNumbers = productOfNumbers*array[i][j];
				}
				else{
					break;
				}
			}
		}
		System.out.println("Power of products under main diagonal is " + productOfNumbers);
	}

}
