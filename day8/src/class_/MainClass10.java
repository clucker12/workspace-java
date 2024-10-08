package class_;

class AAA{
	public void input() {
		System.out.println("입력 기능");
		op(100);
	}
	public void op(int n) {
		System.out.println(n+ ": 연산 기능");
		n += 100;
		print(100, n);
	}
	public void print(int i, int k) {
		System.out.println(i+k+": 출력 기능");
	}
}

public class MainClass10 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.input();
		// a.op(1);
		// a.print(1,2);
	}
}
