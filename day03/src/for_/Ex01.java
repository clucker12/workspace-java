package for_;

public class Ex01 {
	public static void main(String[] args) {
		/* 규칙적으로 동작한다면 반복문 고려*/
//		변수에 1을 저장 후 출력시 1씩 증가 된 값으로 출력되게 만드세요
//		10까지 결과 : 1,2,3,4,5,6,78,9,10
		int i =1;
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("=======================");
		int num =2;
		//1~10까지의 수 중 짝수 출력
		for( ;num<=10;num+=2) {
			System.out.println(num);
		}
		
		System.out.println("=======================");
		
		// 1~10 까지 수 중 짝, 홀 구분해서 출력
		for(i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i+":홀");
			}else {
				System.out.println(i+":짝");
			}
		}
		
		int sum=0, n=0;
		for(n=0;n<=10;n++) {
			sum= sum+n;
			System.out.println(sum);
		}
		
		System.out.println("=======================");
		// 1~10까지의 합중 짝, 홀 수의 합을 구해서 출력
		// 결과 : 짝합 :3-, 홀합 :25
		int sum1=0,sum2=0;
		for(i=1;i<=10;i++) {
			if(i%2==0) {
				sum2+=i;
			}else {
				sum1+=i;
			}
		}
		System.out.println("결과 : 짝합:"+sum2+",홀합 :"+sum1);
		
	}
}
