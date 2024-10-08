package class_;

public class QuizMain1 {
	public static void main(String[] args) {
		QuizTest1 t = new QuizTest1();
		String name;
		System.out.println("이름을 입력 : ");
		name = t.input();
		t.print(name);
	}
}
