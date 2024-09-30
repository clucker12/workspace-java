package input;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? ");
		String name;
		name = input.next();
		
		System.out.print(name + "님의 국어 점수 :  ");
		int korea;
		korea = input.nextInt();
		System.out.print(name + "님의 영어 점수 :  ");
		int english;
		english = input.nextInt();
		System.out.print(name + "님의 수학 점수 :  ");
		int math;
		math = input.nextInt();
		
		System.out.println("=====================");
		System.out.println("이름 : " + name);
		System.out.println("=====================");
		System.out.println("국어 : " + korea);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("=====================");
		System.out.println("합계 : " + (korea+english+math));
		System.out.println("=====================");
	}
}
