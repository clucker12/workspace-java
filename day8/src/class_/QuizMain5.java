package class_;

import java.util.ArrayList;
import java.util.HashMap;

public class QuizMain5 {
	public static void main(String[] args) {
		QuizTest5 t = new QuizTest5();
		HashMap<String,Integer> num = t.input();
		int sum = t.sum(num.get("a"), num.get("b"));
		t.print(sum);
	}
}
