package 정성호;

public class Quiz06 {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		for(i=1;sum<=10000;i++) {
			if(i%2!=0) {
				sum+=i;
			}
			if(sum>=10000) {
				break;
			}
		}
		System.out.println("i값 : " + i + ",총합 : " +sum);
	}
}

