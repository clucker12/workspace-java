package dto;
class ServiceTest03{
	private String name;
	private int kor, eng, sum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void display() {
		
		this.setKor(100);
		this.setEng(100);
		this.setName("홍길동");
		this.setSum(this.getEng() + this.getKor());
		
		System.out.println(this.getName());
		System.out.println(this.getKor());
		System.out.println(this.getEng());
		System.out.println(this.getSum());
	}
	
}

public class TestDTO03 {
	public static void main(String[] args) {
		ServiceTest03 ser = new ServiceTest03();
		ser.display();
	}
}
