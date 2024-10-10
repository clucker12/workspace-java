package variable;

class Test05{
	public int num = 100; // 인스턴스 변수 : 인스턴스가 생성되었을 때
	public static String name = "홍길동"; // 클래스 변수 : 클래스가 메모리에 올라갈 때
	public void test05() {
		System.out.println("test05 실행 !!");
	}
}


public class Ex05 {
	public static void main(String[] args) {
		Test05 t = new Test05();
		t.test05();
		
	}
}
