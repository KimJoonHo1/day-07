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
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>>");
			int sw = scanner.nextInt();
			switch(sw) {
				case 1:
					System.out.print("이름 입력 : ");
					String userName = scanner.next();
					System.out.println("연락처 입력 : ");
					String userTel = scanner.next();
					int check = tel.indexOf(userTel);
					if(check == -1) {
						name.add(userName);
						tel.add(userTel);
					} else {
						System.out.println("이름이 존재합니다.");
					}
					break;
				case 2:
					System.out.print("찾을 전화번호 입력 : ");
					String getTel = scanner.next();
					int check2 = tel.indexOf(getTel);
					if(check2 > -1) {
						System.out.println(name.get(check2) + " : " + tel.get(check2));
					} else {
						System.out.println(getTel + "은 목록에 없습니다.");
					}
					break;
				case 3:
					System.out.print("삭제할 전화 번호를 입력해주세요 : ");
					String remoteTel = scanner.next();
					int remoteTelIndex = tel.indexOf(remoteTel);
					if(remoteTelIndex > -1) {
						tel.remove(remoteTelIndex);
						name.remove(remoteTelIndex);
					} else {
						System.out.println("존재하지 않는 연락처 입니다.");
					}
					break;
				case 4:
					if(name.size() >= 1) {
						for(int i=0; i<name.size(); i++) {
							System.out.println(name.get(i) + " : " + tel.get(i));
						}
					} else {
						System.out.println("아직 목록에 저장된 연락처가 없습니다.");
					}
					
					break;
				case 5:
					System.exit(1);
					break;
				default:
					System.out.println("잘못된 입력으로 종료");
					System.exit(1);
			}
		}
	}

}
