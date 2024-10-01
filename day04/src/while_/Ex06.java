package while_;

public class Ex06 {
	public static void main(String[] args) {
		for(int k=0; k<3;k++) {
			System.out.println("--- 상위 반복 시작");
			for(int i=0; i<3;i++) {
				System.out.println(i+".하위 for");
			}
			System.out.println("상위 반복 끝----");
		}
		System.out.println("===================");
		
		for(int i=2; i<10;i++) {
			for(int k=1;k<9;k++) {
				System.out.println(i+"x"+k+"="+i*k);
			}
		}
		
		
	}
}
