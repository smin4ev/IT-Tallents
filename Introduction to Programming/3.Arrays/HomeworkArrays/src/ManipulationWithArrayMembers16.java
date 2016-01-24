import java.util.Scanner;

public class ManipulationWithArrayMembers16 {

	public static void main(String[] args) {
		//������ ��������� ��� ��������� � < -0.231, ��������� ������ �� �� ����� ��� ������ �� ������� �� �������� �� ������� 
		//+ 41.25, �� � ������� � ����� ������� ������� �� � ������ �� �������, � � �������� ����� � ������(��� ������� � 1, 
		//�������� ����� � 2). �� ������� �������� � ������� �� �������� � ������.
		Scanner sc = new Scanner(System.in);
		float[] array = new float[10];
		float sum = 0;
		float counterOfNumbers = 0;
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextFloat();
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i] < -0.231){
				array[i] = (float) (i*i + 41.25);
			}
			else {
				array[i] = (i+1)*array[i];
			}
		}
		System.out.println("New elements of the arrays are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if(array[i] != 0){
				sum = sum + array[i];
				counterOfNumbers++;
			}
		}
		System.out.println();
		System.out.println("Average value of non zero elements is " + sum/counterOfNumbers);
	}

}
