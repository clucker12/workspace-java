package set_get;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Quiztest01 t = new Quiztest01();
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름 입력 : ");
		name = input.next();
		System.out.println("나이 입력 : ");
		age = input.nextInt();
		t.setName(name);
		t.setAge(age);
		t.ageM(age);
		System.out.println(t.getName()+"님의 나이는"+t.getAge()+"살 입니다");
	}
}
