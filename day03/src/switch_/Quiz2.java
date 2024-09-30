package switch_;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0;
		String home=null;
		String work=null;
		
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			a = scn.nextInt();
			switch(a) {
				case 1:System.out.print("우리집 목적지 입력 :");
				home = scn.next(); System.out.println("등록성공");break;
				case 2:System.out.print("회사 목적지 입력 :");
				work = scn.next(); System.out.println("등록성공");break;
				case 3:System.out.println("우리집 : " + home);
				System.out.println("회사 : " + work); break;
			}
		}
	}
}
