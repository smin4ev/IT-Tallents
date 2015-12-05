import java.util.Scanner;

public class BinarySearch {

	static void binarySearch(int[] array){
		int l = 0;
		int r = array.length-1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for searching in array:");
		int x = sc.nextInt();
		boolean isNumberHere = false;
		while(r>=l) {
			int m = (l+r)/2;
			if(array[m]==x){
				System.out.println("Searched elements is on position " + m);
				isNumberHere = true;
				break;
			}
			if(array[m]<x){
				l=m+1;
			}
			if(array[m]>x){
				r=m-1;
			}
		}
		if(isNumberHere == false){
			System.out.println(-1);
		}
		
	}
	
	public static void main(String[] args) {
		int[] array = {-4,5,9,11,15,21,25,51};
		binarySearch(array);
//		int x = 2;
//		int b= ++x + x++ + x + --x + ++x;
//		System.out.println(b);
		
		
		
		
	}

}
