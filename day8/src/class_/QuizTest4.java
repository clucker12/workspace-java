package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizTest4 {
	public ArrayList<Integer> input() {
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		num.add(input.nextInt());
		System.out.print("수 입력 : ");
		num.add(input.nextInt());
		return num;
	}
	public int sum(int a, int b) {
		return a+b;
	}
	public void print(int sum) {
		System.out.println("두 수의 합 : " + sum);
	}
}
