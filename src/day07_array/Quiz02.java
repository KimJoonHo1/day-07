package day07_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList name = new ArrayList();
		ArrayList tel = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.print(">>>");
			int sw = scanner.nextInt();
			switch(sw) {
				case 1:
					System.out.print("�̸� �Է� : ");
					String userName = scanner.next();
					System.out.println("����ó �Է� : ");
					String userTel = scanner.next();
					int check = tel.indexOf(userTel);
					if(check == -1) {
						name.add(userName);
						tel.add(userTel);
					} else {
						System.out.println("�̸��� �����մϴ�.");
					}
					break;
				case 2:
					System.out.print("ã�� ��ȭ��ȣ �Է� : ");
					String getTel = scanner.next();
					int check2 = tel.indexOf(getTel);
					if(check2 > -1) {
						System.out.println(name.get(check2) + " : " + tel.get(check2));
					} else {
						System.out.println(getTel + "�� ��Ͽ� �����ϴ�.");
					}
					break;
				case 3:
					System.out.print("������ ��ȭ ��ȣ�� �Է����ּ��� : ");
					String remoteTel = scanner.next();
					int remoteTelIndex = tel.indexOf(remoteTel);
					if(remoteTelIndex > -1) {
						tel.remove(remoteTelIndex);
						name.remove(remoteTelIndex);
					} else {
						System.out.println("�������� �ʴ� ����ó �Դϴ�.");
					}
					break;
				case 4:
					if(name.size() >= 1) {
						for(int i=0; i<name.size(); i++) {
							System.out.println(name.get(i) + " : " + tel.get(i));
						}
					} else {
						System.out.println("���� ��Ͽ� ����� ����ó�� �����ϴ�.");
					}
					
					break;
				case 5:
					System.exit(1);
					break;
				default:
					System.out.println("�߸��� �Է����� ����");
					System.exit(1);
			}
		}
	}

}
