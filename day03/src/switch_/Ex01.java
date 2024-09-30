package switch_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		switch(num) {
			case 1: System.out.println("1 입력"); break;
			case 2: System.out.println("2 입력"); break;
			default: System.out.println("그 외의 값");
		}
		System.out.println("다음 문장들 실행...");
		
		System.out.println("문자열 입력");
		String str = input.next();
		switch(str) {
		case "a":System.out.println("a입력");break;
		case "A":System.out.println("A입력");break;
		default: System.out.println("");
		}
		
		System.out.println("------짝 홀 구분------");
		System.out.println("수 입력");
		num = input.nextInt();
		
		System.out.println("결과 : " + num%2);
		int result = num %2;
		System.out.println("result : " + result);
		
		switch(result) {//(num%2) {
			case 0: System.out.println("짝수");break;
			default: System.err.println("홀 수");
		}
	}
}
