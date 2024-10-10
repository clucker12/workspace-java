package variable;


class Test04{
	String name ;
	public void inputData() {
		name = "홍길동";
	}
	
	public void printData() {
		System.out.println(name);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Test04 t = new Test04();
		t.printData();
		t.inputData(); 
		t.printData();
	}
}
