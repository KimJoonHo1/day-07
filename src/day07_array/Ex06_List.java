package day07_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList list = new ArrayList();
		list.add("����");
		list.add("�ұ�");
		list.add("���");
		list.add("���");
		System.out.println(list);
		System.out.print("ã�� �� �Է� : ");
		String n = scanner.next();
		System.out.println(n + " ��ġ : " + list.indexOf(n));
		
		System.out.println("������ ��ġ �Է�");
		int num = scanner.nextInt();
		System.out.println("������ �� �Է�");
		n = scanner.next();
		System.out.println("������\n" + list);
		list.set(num, n);
		System.out.println("������\n" + list);
	}

}
