package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		// id�Է�
		// ...
		// pw �Է�
		// "pass"
		// "abc"
		System.out.println("�α���");
		//Ÿ�� �ν��Ͻ����� = new Ŭ������ ();
		Scanner sc = new Scanner(System.in);
		System.out.println("ID�Է� [        ]");
		String id = sc.next(); // �´� �Ƶ� kim
		System.out.println("PW�Է� [       ]");
		String pw = sc.next(); // �´� ��� 1
		final String WRONG = "Ʋ���ϴ�";
		if (id.equals("kim") && pw.equals("1")) {
			System.out.println("�α��� ����");
		} else if (!id.equals("kim") && pw.equals("1")) {
			System.out.println("ID��" +WRONG);
		} else if (!pw.equals("1") && id.equals("kim")) {
			System.out.println("��й�ȣ��" +WRONG );
		} else {
			System.out.println("ID PW��" +WRONG);
		}
		
	}

}