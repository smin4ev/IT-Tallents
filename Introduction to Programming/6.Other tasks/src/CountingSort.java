import java.util.Arrays;

public class CountingSort {

	public static int[] countingSort(int[] array){
		       //�������� ���-������� ������� � ������
				int maxElement = array[0];
				int minElement = array[0];
				for(int i = 0; i<array.length; i++){
					if(array[i]>maxElement){
						maxElement = array[i];
					}
					//������ ���-������ �������, �� �� ���� �� ������ � � ����������� �����
					//��� �� �� ����������, �� ������ ���� � �����������
					if(array[i]<minElement){
						minElement = array[i];
					}
				}
				minElement = minElement*(-1);
				//��� ����� ������� �� ������ ��������� ���������� ������� - ���� ���-������� �� � 0
				for (int i = 0; i < array.length; i++) {
					array[i] = array[i]+minElement;
				}
				
				//��������� ������� ����� � �������� ���-������� �������+1
				int[] helpArray = new int[maxElement+1];
				//��������� �������� �����, ���� �� ������� �� ������� ����������� �� �������� �����
				for (int i = 0; i < array.length; i++) {
					int currentNum = array[i];
					helpArray[currentNum]++;
				}
				//��������� �� ��� ����� � �������� ��������(���� �� �� ������ � ��������)
				int[] resultArray = new int[array.length];
				int counter = 0;
				for (int i = 0; i < helpArray.length; i++) {
					while(helpArray[i]>0){
						resultArray[counter] = i-minElement;//�� ����� ������� ����� ���������� �� �� ������ ��������� �� ��������
						counter++;
						helpArray[i]--;
					}
				}
				return resultArray;
						
	}
	
	public static void main(String[] args) {
		int[] array = {1,1,2,3,1,32,2,1,3,2};
		array = countingSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
