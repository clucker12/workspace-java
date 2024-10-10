package set_get;

class Test04{
	private int age, num, aaa,bbb,ccc;
	public int getAge() {
		return age;
	}
	public int getNum() {
		return num;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAaa() {
		return aaa;
	}
	public void setAaa(int aaa) {
		this.aaa = aaa;
	}
	public int getBbb() {
		return bbb;
	}
	public void setBbb(int bbb) {
		this.bbb = bbb;
	}
	public int getCcc() {
		return ccc;
	}
	public void setCcc(int ccc) {
		this.ccc = ccc;
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Test04 t = new Test04();
		System.out.println(t.getAge());
		System.out.println(t.getNum());
		
		t.setAge(2222);
		System.out.println(t.getAge());
		t.setNum(1212);
		System.out.println(t.getNum());
	}
}
