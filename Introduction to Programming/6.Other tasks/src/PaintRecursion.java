
public class PaintRecursion {

	public static void paint(char[][] array, int row, int col){
		if(row<0 || row>=array.length){
			return;
		}
		if(col<0 || col>=array[0].length){
			return;
		}
		if(array[row][col] != ' '){
			return;
		}
		array[row][col] = 'r';
		paint(array, row-1,col);
		paint(array, row+1,col);
		paint(array, row, col-1);
		paint(array, row, col+1);
	}
	
	public static void main(String[] args) {
		char[][] array = {
				{' ', ' ', 'b',' ',' ','b'},
				{' ', ' ', ' ','b', ' ','b'},
				{' ', ' ', ' ', ' ', 'b','b'},
				{' ', ' ', ' ', ' ', ' ',' '},
				{' ', ' ', 'b', ' ', ' ','b'},
		};
		int row = 2;
		int col = 2;
		paint(array, row, col);
		array[row][col] = 'x';
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
			 System.out.print(array[i][j] + " ");    
			}
			System.out.println();
		}

	}

}