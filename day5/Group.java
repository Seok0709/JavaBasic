package day5;

import java.util.Scanner;

public class Group {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3]; //학생 3명 있는반
		for(int i =0; i<arr.length; i++) {
			System.out.println("[이름]"+arr[i].getName()+"[점수] "+arr[i].getScore()+"\n");
			System.out.println("이름:    ");
			String name = sc.next();
			System.out.println("점수:    ");
			int score = sc.nextInt();
			Student st1 = new Student();
			st1.setName(name);
			st1.setScore(score);
			arr[i] = st1;
			
		}
		//첫번쨰 학생
		//두번째 학생
		for(int i=0; i<arr.length;i++) {
			System.out.println("[이름]"+arr[i].getName()+"[점수] "+arr[i].getScore()+"\n");
		}
	}
}
