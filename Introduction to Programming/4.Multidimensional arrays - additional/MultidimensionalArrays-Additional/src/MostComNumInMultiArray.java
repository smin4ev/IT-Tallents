
public class MostComNumInMultiArray {
	public static void main(String[] args) {
		
		int [][] array = {
				{12,34,88,65,43,54},
				{88,91,19,16,51,59},
				{67,43,88,51,43,18},
				{78,21,69,43,93,41},
				{88,28,57,72,21,88}	
		};
		int mostComNum = 0;
		int counterOfMostNumber = 1;
		int counter = 0;
		int finalNUm = 0;
		int itteration = 0;
		int i = 0;
		int j = 0;
		while(itteration<array.length*array[0].length){
			array[i][j] = mostComNum;
			for (i = 0; i < array.length; i++) {
				for (j = 0; j < array[i].length; j++) {
					if(array[i][j] == mostComNum){
						counter++;
					}
					
						
					}
				}
			if(counter>counterOfMostNumber){
				counterOfMostNumber = counter;
				finalNUm = mostComNum;
				itteration++;
			}
			}
		}
}

