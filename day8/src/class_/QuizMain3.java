package class_;

public class QuizMain3 {
	public static void main(String[] args) {
		QuizTest3 t = new QuizTest3();
		int[] num = t.input();
		int sum = t.sum(num[0], num[1]);
		t.print(sum);
	}
}
