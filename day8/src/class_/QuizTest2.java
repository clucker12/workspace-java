package class_;

import java.util.Scanner;

public class QuizTest2 {
	public String[] input() {
		String[] name = new String[3];
		for(int i=0; i<3;i++) {
			System.out.print("이름 입력 : ");
			Scanner input = new Scanner(System.in);
			name[i] = input.next();
		}
		return name;
	}
	public void print(String[] name) {
		for(int i=0;i<name.length;i++) {
			System.out.println("이름 : "+name[i]);
		}
	}
}
