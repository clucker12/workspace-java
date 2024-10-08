package class_;

import java.util.ArrayList;

public class QuizMain4 {
	public static void main(String[] args) {
		QuizTest4 t = new QuizTest4();
		ArrayList<Integer> num = t.input();
		int sum = t.sum(num.get(0), num.get(1));
		t.print(sum);
	}
}
