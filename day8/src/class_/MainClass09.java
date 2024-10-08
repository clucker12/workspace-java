package class_;

public class MainClass09 {
	public static void main(String[] args) {
		
		TestClass09 t = new TestClass09();
		int num = t.inputData();
		int s = t.sumFunc(num);
		
		t.print(num, s);
		
	}
}
