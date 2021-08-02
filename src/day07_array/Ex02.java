package day07_array;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name[] = new String[3];
		
		for(int i=0; i<name.length; i++) {
			System.out.print(i + 1 + "번째 이름 입력 : ");
			name[i] = scanner.next();
		}
		for(int i=0; i<name.length; i++) {
			System.out.println(i + 1 + "번째 이름 : " + name[i]);
		}
	}

}
