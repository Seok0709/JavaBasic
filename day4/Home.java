package day4;

import java.util.Scanner;

import day3.Kakao;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է�:    ");
		String name = sc.next();
		System.out.println("���� �Է�:    ");
		int age = sc.nextInt();
		System.out.println("�̸��� �Է�:   ");
		String email = sc.next();
		Member mb = new Member();
		mb.setName(name);
		mb.setAge(age);
		mb.setEmail(email);
		System.out.println("�󼼻��� : �̸� ["+mb.getName()+"] ����["+mb.getAge()+"] �̸���["+mb.getEmail()+"]");
		
		
	}
}
