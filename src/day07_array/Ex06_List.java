package day07_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList list = new ArrayList();
		list.add("설탕");
		list.add("소금");
		list.add("라면");
		list.add("계란");
		System.out.println(list);
		System.out.print("찾을 값 입력 : ");
		String n = scanner.next();
		System.out.println(n + " 위치 : " + list.indexOf(n));
		
		System.out.println("변경할 위치 입력");
		int num = scanner.nextInt();
		System.out.println("변경할 값 입력");
		n = scanner.next();
		System.out.println("변경전\n" + list);
		list.set(num, n);
		System.out.println("변경후\n" + list);
	}

}
