package inheritance;

class A04{
	public void aaa() {
		System.out.println("A04 aaa 실행");
	}
}
class B04 extends A04{
	public void test() {
		System.out.println("test 실행");
		// super은 부모클래스의 메소드를 실행
		super.aaa();
		this.aaa();
	}
	public void aaa() {
		System.out.println("B04 aaa 실행");
		// 같은 이름의 메소드가 자식에 있으면 자식클래스메소드가 먼저 실행하고
		// 없는경우 부모에서 상속 받은 메소드가 실행
	}
}


public class Ex04 {
	public static void main(String[] args) {
		B04 b = new B04();
		b.test();
	}
}
