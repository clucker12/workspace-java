package set_get;

import java.util.ArrayList;

class Test02 extends ArrayList{
	public void test() {
		add("aaa");
	}
	public boolean add1111(Object obj) {
		System.out.println("내가 만든 add");
		return true;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.test();
	}
}
