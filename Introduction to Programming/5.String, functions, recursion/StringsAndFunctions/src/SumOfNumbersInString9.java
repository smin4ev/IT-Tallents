import java.util.Scanner;

public class SumOfNumbersInString9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with letters, digits and sign '-':");
		String testStr = sc.nextLine();
		int sum = 0;
		String helper = "";
		int intHelper = 0;
		for (int i = 0; i < testStr.length(); i++) {
			if(testStr.charAt(i) == 45){                   //45 � ����� �� ����� -
				if(testStr.charAt(testStr.length()-1) == 45){//����������� ���� ����� - �� � ��������
															//��� � �������� - �������, ����� ������
															//3 ���� ��-������, ������ ��� i+1		
					break;
				}
				//����������� ���� �������� ���� ����� - � ����� �� 1 �� 9
				if(testStr.charAt(i+1)>=49 && testStr.charAt(i+1)<=57){
					helper = "-";
					i++;
					do{
						helper = helper+testStr.charAt(i);
						i++;
						if(i>testStr.length()-1){//�������� �� �� �� ������ ����� �������
							break;
						}
					}
					while(testStr.charAt(i)>=48 && testStr.charAt(i)<=57 );//�������� ����� ������ �� ������ ���� ������
					i--;
					intHelper = Integer.parseInt(helper);
					System.out.println(intHelper);
					sum = sum+intHelper;
					helper = "";
					continue;
				}	
			}
			
			//����������� ���� �������� ������ �� � ����� � ��� � �� �������� � ������
			if(testStr.charAt(i)>=49 && testStr.charAt(i)<=57){
				do{
					helper = helper+testStr.charAt(i);
					i++;
					if(i>testStr.length()-1){//�������� �� �� �� ������ ����� �������
						break;
					}
				}
				while(testStr.charAt(i)>=48 && testStr.charAt(i)<=57);
				i--;
				intHelper = Integer.parseInt(helper);
				System.out.println(intHelper);
				sum = sum+intHelper;
				helper = "";
			}
		}
		
		System.out.println("Sum is " + sum);	
	}
}
