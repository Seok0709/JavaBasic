package day5;

import java.util.Scanner;

public class Group {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3]; //�л� 3�� �ִ¹�
		for(int i =0; i<arr.length; i++) {
			System.out.println("[�̸�]"+arr[i].getName()+"[����] "+arr[i].getScore()+"\n");
			System.out.println("�̸�:    ");
			String name = sc.next();
			System.out.println("����:    ");
			int score = sc.nextInt();
			Student st1 = new Student();
			st1.setName(name);
			st1.setScore(score);
			arr[i] = st1;
			
		}
		//ù���� �л�
		//�ι�° �л�
		for(int i=0; i<arr.length;i++) {
			System.out.println("[�̸�]"+arr[i].getName()+"[����] "+arr[i].getScore()+"\n");
		}
	}
}
