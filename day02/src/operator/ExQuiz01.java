package operator;

import java.util.Scanner;

public class ExQuiz01 {
	public static void main(String[] args) {
		String result;
		int a,b;
		Scanner scn = new Scanner(System.in);
		System.out.print("수 입력 :");
		a = scn.nextInt();
		
		result = (a%2==0)?"짝수":"홀수";
		System.out.println(a+"="+result);
		result = (a%3==0)?"3의 배수":"3의 배수가 아니다";
		System.out.println(a+"="+result);
		
		System.out.print("두 수 입력 :");
		a = scn.nextInt();
		b = scn.nextInt();
		System.out.print("num1 :"+a +",num2 :" +b);
		result = (a > b)?"num1이 num2보다 크다":"num2가num1보다크다";
		System.out.println(result);
	}
}
