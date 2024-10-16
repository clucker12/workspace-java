package abstract_;

interface A02{
	// interface 안에 있는 메서드는 추상화로 만든다.
	public void test();
	public int test2();
}
class B02 implements A02{

	@Override
	public void test() {
		System.out.println("test실행");
		
	}

	@Override
	public int test2() {
		System.out.println("test2실행");
		return 0;
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		B02 b = new B02();
		b.test();
		b.test2();
	}
}
