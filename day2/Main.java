package day2;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("####### 회원관리창 ########");
		join();

	}

	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****회원가입 창******");
		System.out.println("아이디 입력");
		String id = sc.next();
		System.out.println("비번 입력");
		String pw = sc.next();
		User us = new User();
		us.setId(id); 
		us.setPw(pw);
		System.out.println("가입 정보 ID:"+us.getId()+", PW:"+us.getPw());
		login(us);
			}
	public static void login(User us) {
		System.out.println("로그인 창");
		Scanner sc = new Scanner(System.in);
		// System.out.println("아이디 입력");
		// System.out.println("비번 입력");
		
		String id = us.getId();
		String pw = us.getPw();
		System.out.println("가입 정보 ID:"+id+", PW:"+pw);

	}

}