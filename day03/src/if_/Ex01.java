package if_;

public class Ex01 {
	public static void main(String[] args) {
		int num =150;
		if(num >0 && num <= 100) {
			System.out.println("0~100 사이 수");
		} else {
			System.out.println("그 외의 값");
		}
		System.out.println("다음 문장들 실행");
		
		num = -100;
		if(num >0) {
			if( num <= 100) {
			System.out.println("0~100 사이 수");
			} else {
				System.out.println("100보다 큰 양수");
			}
		} else {
			System.out.println("음수 입니다!!");
		}
		System.out.println("다음 문장들 실행");
	}
	
	
}
