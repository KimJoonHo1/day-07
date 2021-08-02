package day07_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int num;
		String addNum, printNum;
		System.out.print("만들 공간의 개수 입력 : ");
		num = scanner.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("추가할 수 입력");
			addNum = scanner.next();
			list.add(addNum);
		}
		System.out.println("--- 저장 값 출력 ----");
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			String s = (String) obj;
			System.out.println(s);
		}
	}

}
