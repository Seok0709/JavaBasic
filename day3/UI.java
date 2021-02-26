package day3;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력:    ");
		String ph = sc.next();
		System.out.println("메세지 입력:     ");
		String msg = sc.next();
		System.out.println("입력한 정보 : 전화번호 ["+ph+"] 문자["+msg+"]");
		System.out.println("입력한 정보 : 전송 버튼 클릭");
		Kakao k = new Kakao();
		k.setPh(ph);
		k.setMsg(msg);
		System.out.println("입력한 정보 : 전화번호 ["+k.getPh()+"] 문자["+k.getmsg()+"]");
		
}
}