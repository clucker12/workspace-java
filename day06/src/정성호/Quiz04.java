package 정성호;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("세 수 입력");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int fi=0,se=0,la=0;
		if(a>b && a>c) {
			fi = a;
			if(b>c) {
				se = b;
				la = c;
			}else {			
				se = c;
				la = b;
			}
		}else if(b>a && b>c) {
			fi = b;
			if(a>c) {
				se = a;
				la = c;
			}else {
				se = c;
				la = a;				
			}
		}else if(c>a && c>b) {
			fi = c;
			if(a>b) {
				se = a;
				la = b;
			}else {
				se = b;
				la = a;				
			}
		}else {
			System.out.println("해당 x");
		}
		System.out.println("가장 큰수 : " + fi);
		System.out.println("두번째 큰 수 : " + se);
		System.out.println("마지막 수 : " + la);
	}
}
