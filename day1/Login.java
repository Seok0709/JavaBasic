package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		// id입력
		// ...
		// pw 입력
		// "pass"
		// "abc"
		System.out.println("로그인");
		//타입 인스턴스변수 = new 클래스명 ();
		Scanner sc = new Scanner(System.in);
		System.out.println("ID입력 [        ]");
		String id = sc.next(); // 맞는 아디 kim
		System.out.println("PW입력 [       ]");
		String pw = sc.next(); // 맞는 비번 1
		final String WRONG = "틀립니다";
		if (id.equals("kim") && pw.equals("1")) {
			System.out.println("로그인 성공");
		} else if (!id.equals("kim") && pw.equals("1")) {
			System.out.println("ID가" +WRONG);
		} else if (!pw.equals("1") && id.equals("kim")) {
			System.out.println("비밀번호가" +WRONG );
		} else {
			System.out.println("ID PW가" +WRONG);
		}
		
	}

}