package day2;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("####### ȸ������â ########");
		join();

	}

	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****ȸ������ â******");
		System.out.println("���̵� �Է�");
		String id = sc.next();
		System.out.println("��� �Է�");
		String pw = sc.next();
		User us = new User();
		us.setId(id); 
		us.setPw(pw);
		System.out.println("���� ���� ID:"+us.getId()+", PW:"+us.getPw());
		login(us);
			}
	public static void login(User us) {
		System.out.println("�α��� â");
		Scanner sc = new Scanner(System.in);
		// System.out.println("���̵� �Է�");
		// System.out.println("��� �Է�");
		
		String id = us.getId();
		String pw = us.getPw();
		System.out.println("���� ���� ID:"+id+", PW:"+pw);

	}

}