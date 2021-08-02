package day07_array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arr[] = {10, 54, 13, 17, 25, 30};
		String odd_even = null;
		System.out.print("Â¦¼ö, È¦¼ö ÀÔ·Â : ");
		odd_even = scanner.next();
		
		for(int i=0; i<arr.length; i++) {
			switch(odd_even) {
				case "Â¦¼ö":
					if(arr[i] % 2 == 0) {
						System.out.println("Â¦¼ö : " + arr[i]);
					}
					break;
				case "È¦¼ö":
					if(arr[i] % 2 != 0) {
						System.out.println("È¦¼ö : " + arr[i]);
					}
					break;
				default:
					System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù.");
			}
		}
	}

}
