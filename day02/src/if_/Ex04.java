package if_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//두 정수가 짝수일때만 더한 값이 나오는 프로그램을 만드세요
		//홀수가 있으면 홀수가 포함 되어있습니다라고 하는 문장을 넣어주세요
		Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int a = sc.nextInt();
        System.out.print("정수 입력: ");
        int b = sc.nextInt();
        int total;
        
        if(a%2==0 && b%2==0) {
        	total = a+b;
        	System.out.println(total);
        }
        else
        	System.out.println("홀수가 포함 되어있습니다.");
	}
}
