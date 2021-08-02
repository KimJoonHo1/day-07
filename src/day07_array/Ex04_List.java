package day07_array;

import java.util.ArrayList;

public class Ex04_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 List
		 - ArrayList
		 - LinkedList
		 - Stack... 등등
		 ArrayList
		 - 데이터에 대한 순서가 있음
		 - 중복된 데이터 저장 가능
		 - 배열과는 다르게 서로 다른 자료형을 넣을 수 있음
		 - 가변의 크기를 가짐
		 */
		
		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add(456);
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());
	}

}
