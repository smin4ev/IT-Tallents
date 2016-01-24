
public class ElementsOfBooleanArrayOverSecondaryDiagonal8 {

	public static void main(String[] args) {
		boolean[][] array = {
				{true,false,false,true},
				{false,false,false,true},
				{false,false,false,true},
				{false,false,false,true}
		};
		int counterTrue = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if((i+j)<array.length-1){
					if(array[i][j] == true){
						counterTrue++;
					}
				}
			}
		}
		if(counterTrue == 0){
		System.out.println("There is no element 'true' over secondary diagonal!");
		}
		else
			if(counterTrue==1){
				System.out.println("There is one element 'true' over secondary diagonal! ");
			}
		else 
			if(counterTrue>1){
				System.out.println("There are " + counterTrue + " elements 'true' over secondary diagonal");
			}

	}

}
