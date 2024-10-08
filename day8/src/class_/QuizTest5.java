package class_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizTest5 {
	public HashMap<String,Integer> input() {
		HashMap<String,Integer> num = new HashMap<String, Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		num.put("a", input.nextInt());
		System.out.print("수 입력 : ");
		num.put("b", input.nextInt());
		return num;
	}
	public int sum(int a, int b) {
		return a+b;
	}
	public void print(int sum) {
		System.out.println("두 수의 합 : " + sum);
	}
}
