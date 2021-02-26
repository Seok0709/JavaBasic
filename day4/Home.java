package day4;

import java.util.Scanner;

import day3.Kakao;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력:    ");
		String name = sc.next();
		System.out.println("나이 입력:    ");
		int age = sc.nextInt();
		System.out.println("이메일 입력:   ");
		String email = sc.next();
		Member mb = new Member();
		mb.setName(name);
		mb.setAge(age);
		mb.setEmail(email);
		System.out.println("상세사항 : 이름 ["+mb.getName()+"] 나이["+mb.getAge()+"] 이메일["+mb.getEmail()+"]");
		
		
	}
}
