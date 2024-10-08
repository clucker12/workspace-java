package class_;

public class TestClass11 {
	public void test1() {
		int num = 1;
		if(num == 1) {
			System.out.println("if 실행");
			return;
		}
		System.out.println("다음 문장들!");
	}
	
	public int test2() {
		int num = 10;
		if(num < 10) {
			return 1;
		}
		else if(num > 10) {
			return 2;
		}
		return 0;
	}
	
	public String test3() {
		int num = 5;
		if(num==5) {
			return "5와 같다";
		}
		return null;
	}
}
