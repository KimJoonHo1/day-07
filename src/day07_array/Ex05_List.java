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
		System.out.print("���� ������ ���� �Է� : ");
		num = scanner.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("�߰��� �� �Է�");
			addNum = scanner.next();
			list.add(addNum);
		}
		System.out.println("--- ���� �� ��� ----");
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			String s = (String) obj;
			System.out.println(s);
		}
	}

}
