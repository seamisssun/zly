package C5;

public class Test1 {

	/**
	 * ɾ��������ָ����Ԫ�أ�������������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 5, 8, 9, 6, 3 };
		int[] arr1 = new int[arr.length - 1];
		int a = 9;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("�޴���");
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (i < index) {
					arr1[i] = arr[i];
				}
				if (i > index) {
					arr1[i - 1] = arr[i];
				}
			}
		}
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
