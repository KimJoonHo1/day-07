package day07_array;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	�迭
		 	- ���� �ڷ������� �������� ������ ����� ����ϴ� ��
		 	- �ڷ���[] ������(�迭��)
		 	- �ڷ��� �迭��[]
		 	- index(÷��) : 0��° ���� ����
		 */
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i + 1) * 100;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println(arr.length);
	}

}
