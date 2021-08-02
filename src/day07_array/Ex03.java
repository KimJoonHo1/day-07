package day07_array;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 54, 13, 17, 25, 30};
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println("Â¦¼ö : " + arr[i]);
			} else {
				System.out.println("È¦¼ö : " + arr[i]);
			}
		}
	}

}
