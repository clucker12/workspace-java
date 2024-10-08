package class_;

import java.util.Scanner;

public class QuizTest1 {
	public String input() {
		String name;
		Scanner input = new Scanner(System.in);
		name = input.next();
		return name;
	}
	public void print(String name) {
		System.out.println("이름 : "+name);
	}
}
