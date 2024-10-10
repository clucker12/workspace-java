package variable;

import java.util.ArrayList;


class TestClass01{
	public void sumFunc() {
		System.out.println("매개 변수 없음!!!");
	}
	public void sumFunc(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public void sumFunc(String s1, int n1) {
		System.out.println(n1 + s1);
	}
	
}


public class Ex01 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		TestClass01 t = new TestClass01();
		t.sumFunc();
		t.sumFunc(1,2);
		t.sumFunc("a", 0);
		
		Test05 t05 = new Test05();
		t05.test05(); 
	}
}
