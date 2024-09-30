package input;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num;
		num = a.nextInt();
		System.out.println("입력 값 : " + num);
		
		double dou;
		System.out.println("실수 입력 :");
		dou = a.nextDouble();
		System.out.println("입력 실수 :" + dou);
		
		String str;
		System.out.println("문자열 입력");
		str = a.next();
		System.out.println("입력 문자열 : " + str);
	}
}
