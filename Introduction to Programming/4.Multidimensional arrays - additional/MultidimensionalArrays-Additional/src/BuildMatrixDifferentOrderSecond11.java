import java.util.Scanner;

public class BuildMatrixDifferentOrderSecond11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive numbers for matrix size:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		while(row<1 || col<1){
			System.out.println("Please enter positive numbers:");
			row = sc.nextInt();
			col = sc.nextInt();
		}
		int [][] array = new int[row][col];
		int valueInArray = 1;
		int temp = 1;
		
		//�� �� �� �������� ����� ��������� �� �������, ������ �� �� �������� � �������
		//���������������� �� ����������� �� ��� - j �� �������� �� ��������, ������ ��
		//�� ����� �� array.length, � i �� �������� �� ��������, �� ���� �� �� ����� ��
		//array[0].length
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = valueInArray++;
			}
		}
		
		//����� ������� ��� ���������� ������������ �� i � j, �� � ����������� �� ����������
		//� +4 �� ����� �������� �������� � ������� �� ���������� �� �������� �� ����� ��� ���
//		for (int i = 0; i < array.length; i++) {
//			valueInArray = temp;
//			for (int j = 0; j < array[i].length; j++) {
//				array[i][j] = valueInArray;
//				valueInArray = valueInArray+4;
//			}
//			temp++;
//		}
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
