package variable;

public class ExClass01 {
	public static void main(String[] args) {
		int age = 30;
		double weight = 55.0 , height = 170.0;
		// double height = 170.0;
		System.out.println("나의 나이는" + age);
		System.out.println(weight);
		System.out.println("키는" + height + "cm 입니다");
		
		System.out.println("--------------");
		
		int number = 123; // 초기화
		System.out.println("변경 전 num : " + number);
		number = 100;
		System.out.println("변경 후 num : " + number);
		number = number + 200;
		System.out.println("변경 후 num : " + number);
		
	}
}
