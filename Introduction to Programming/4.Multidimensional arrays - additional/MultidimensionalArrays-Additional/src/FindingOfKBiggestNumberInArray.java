
public class FindingOfKBiggestNumberInArray {

	public static void main(String[] args) {
		int[] array = {43,5,45,65,5,9,6,21,31};
		int temp = 0;//���� ���������, ����� ����� ������ �� ���� ����� �� ��������� ���-������ �����
		int biggesNum = Integer.MIN_VALUE;//���� ���-������� ������� ��� ����� ���������
		int currentBigIndex = 0;//���� ������� �� ������� ���-����� �������
		int k = 6;//�-�� ���-����� �������(������ �� �� ������� �� ���������)
		int nextBigNum = 0;//����� �� ���������� ���-������ ����� �� ��������
		while(nextBigNum<k){
			for (int i = nextBigNum; i < array.length; i++) {
				if(array[i]>biggesNum){
					biggesNum = array[i];
					currentBigIndex = i;
				}	
			}
			temp = array[nextBigNum];//��������� ������� � �������� �� ������� ��� �������� ����������
			array[nextBigNum] = biggesNum;//���������� ���-����� ������� �� ����� ��������� ����� � ������
			array[currentBigIndex] = temp;//���������, ����� � ��� �� ������� �����, ����� �� ������� �� ������� ���-�����
			nextBigNum++;
			biggesNum = Integer.MIN_VALUE;
			//� ���� 4 ���� ���� �� �� ���� ��� �� ����������� ������
//			for (int i = 0; i < array.length; i++) {
//				System.out.print(array[i] + " ");
//			}
//			System.out.println();
		}
		for (int i = 0; i < k; i++) {
			System.out.print(array[i] + " ");
		}
		 System.out.println("�-�� ���-������ ����� � " + array[k-1]);

	}

}
