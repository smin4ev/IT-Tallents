
public class ElementsOnMainDiagonal6 {

	public static void main(String[] args) {
		int[][] array = {
				{12,34,16,65,23,54},
				{44,91,19,16,51,59},
				{67,22,92,51,43,18},
				{78,21,69,46,93,41},
				{10,28,57,72,21,88},
				{41,19,62,11,25,40}
		};
		System.out.println("Elements on main diagonal are:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j){
					System.out.print(array[i][j] + " ");
				}
			}
		}

	}

}
