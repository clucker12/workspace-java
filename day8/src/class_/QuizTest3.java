package class_;

import java.util.Scanner;

public class QuizTest3 {
	public int [] input() {
		int [] num = new int[2];
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		num[0] = input.nextInt();
		System.out.print("수 입력 : ");
		num[1] = input.nextInt();
		return num;
	}
	public int sum(int a, int b) {
		return a+b;
	}
	public void print(int sum) {
		System.out.println("두 수의 합 : " + sum);
	}
}
