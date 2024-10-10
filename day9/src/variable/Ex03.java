package variable;
class Test03{
	public void test1() {
		int var = 100;
		System.out.println(var + " : 11111");
	}
	public void test2() {
//		System.out.println(var + "22222");		
	}
	
}



public class Ex03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		t.test1();
		t.test2();
		
		int num =200;
		if(true) {
			num = 100;
		}
		
	}
}
