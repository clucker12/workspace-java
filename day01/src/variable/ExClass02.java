package variable;

public class ExClass02 {
	public static void main(String[] args) {
		char ch = 'A';
		String str = "안녕하세요";
		System.out.println(ch);
		System.out.println(str);
		
		ch = '안';
		str = "반갑습니다";
		System.out.println(ch);
		System.out.println(str);
		
		System.out.println("--- 상수 ---");
		final String KOREA = "대한민국";
		System.out.println(KOREA);
//		korea = "미국";
//		System.out.println(korea);	
		
		System.out.println("---- 형 변환(type casting) ----");
		char ch02 = 'A';
		int ret;
		System.out.println(ch02);
		System.out.println((int)ch02);
	}
}
