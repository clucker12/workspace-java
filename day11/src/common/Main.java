package common;

import java.util.Scanner;

import service.Create_Member;

public class Main {
	public static void main(String[] args) {
		Create_Member cre = new Create_Member();
		Scanner input = new Scanner(System.in);
		int n;
		boolean on=true, on1 = false;
		boolean log = false;
		while(on) {
			if(!log) {
				System.out.println("1.회원가입");
				System.out.println("2.로그인");
				n= input.nextInt();
				switch(n) {
				case 1:
					if(!on1) {
						cre.display();
						on1 = true;
						break;
					}else {
						System.out.println("회원 가입 불가");
					}
					break;
				case 2:
					if(on1) {
						cre.display1();
						log = true;
						break;
					}else {
						System.out.println("회원이 없습니다.");
					}
					break;
					
				}
			}else {
				System.out.println("3.회원가입");
				System.out.println("4.로그인");
				n= input.nextInt();
				switch(n) {
				case 3:
					
				}
			}
			
				
		}
	}
}
