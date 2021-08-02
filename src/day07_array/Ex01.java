package day07_array;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	배열
		 	- 같은 자료형으로 여러개의 공간을 만들어 사용하는 것
		 	- 자료형[] 변수명(배열명)
		 	- 자료형 배열명[]
		 	- index(첨자) : 0번째 부터 시작
		 */
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i + 1) * 100;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println(arr.length);
	}

}
