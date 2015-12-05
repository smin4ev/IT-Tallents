
public class ExtremumInArray10 {

	public static void extremum(int[] array) {
		if (array.length == 1) {
			System.out.println(array[0] + "-0(хълм и падина)!");
			return;
		}
		if (array[0] < array[1]) {
			int counter = 1;
			boolean flag = true;
			for (int i = 1; i < array.length - 1; i++) {
				if (array[i] <= array[i + 1]) {
					counter++;
					continue;
				}
				if (array[i] > array[i + 1]) {
					for (int j = i; j < array.length - 1; j++) {
						if (array[j] < array[j + 1]) {
							flag = false;
							break;
						}
					}
					if (flag == false) {
						System.out.println("Array is not good");
						break;
					} else {
						System.out.println(counter + "(хълм)");
						break;
					}
				}
			}
			if (counter == array.length - 1) {
				System.out.println(counter + "(хълм)");
			}
		} else {
			if (array[0] >= array[1]) {
				int counter = 1;
				boolean flag = true;
				for (int i = 1; i < array.length - 1; i++) {
					if (array[i] > array[i + 1]) {
						counter++;
						continue;
					}
					if (array[i] < array[i + 1]) {
						for (int j = i; j < array.length - 1; j++) {
							if (array[j] > array[j + 1]) {
								flag = false;
								break;
							}
						}
						if (flag == false) {
							System.out.println("Array is not good!");
							break;
						} else {
							System.out.println(counter + "(падина)");
							break;
						}
					}
				}
				if (counter == array.length - 1) {
					System.out.println(counter + "(падина)");
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 10, 30, 30, 50, 40, 20 };
		extremum(array);

	}

}
