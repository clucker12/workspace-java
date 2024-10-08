package class_;

public class QuizMain2 {
	public static void main(String[] args) {
		QuizTest2 t = new QuizTest2();
		String[] name;
		name = t.input();
		t.print(name);
		System.out.println(name.length);
	}
}
