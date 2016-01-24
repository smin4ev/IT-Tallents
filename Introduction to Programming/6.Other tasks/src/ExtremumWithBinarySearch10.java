
public class ExtremumWithBinarySearch10 {

	static void searchExtremum(int[] array){
		int l = 0;
		int r = array.length-1;
		while(l<=r){
			int m = (l+r)/2;
			if(m==0){
				System.out.println(array.length-1 + "(падина)");
				return;
			}
			if(m == array.length-1){
				System.out.println(array.length-1 + "(хълм)");
				return;
			}
			if(array[m]>array[m-1] && array[m]>array[m+1]){
				System.out.println(m + "(хълм)");
				return;
			}
			if(array[m]<array[m-1] && array[m]<array[m+1]){
				System.out.println(m + "(падина)");
				return;
			}
			if(array[m]>array[m-1] && array[m]<array[m+1]){
				l=m+1;
			}
			if(array[m]>array[m+1] && array[m]<array[m-1]){
				r=m-1;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {10,11,12,13,14,12,11,10,7,6,5,4};
		searchExtremum(array);
	}

}
