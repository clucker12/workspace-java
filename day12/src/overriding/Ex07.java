package overriding;

import java.util.Scanner;

class Parents{
	public void familyNmae() {
		System.out.println("이");
	}
	public void name() {
		familyNmae();
		System.out.println("순신");
	}
}
class Daughter extends Parents{
	public void name() {
		familyNmae();
		System.out.println("하이");
	}
}
class Son extends Parents{
	public void name() {
		familyNmae();
		System.out.println("기광");
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Parents p = null;
		Daughter d = null;
		Son s = null;
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("1.부모");
		System.out.println("2.딸");
		System.out.println("3.아들");
		System.out.println("선택하세요");
		num = input.nextInt();
		if(num == 1) {
			p = new Parents();
		}else if(num ==2) {
			p = new Daughter();
			
		}else if(num == 3) {
			p = new Son();
		}
		p.name();
		/*
		if(p != null) {
			p.name();
		}else if( d!= null) {
			d.name();
		}else if(s != null) {
			s.name();
		}
		*/
		/*
		// 업 캐스팅
		Parents p = new Parents();
		p.name();
		p = new Daughter();
		p.name();
		p = new Son();
		p.name();
		*/
		/*
		Parents p = new Parents();
		p.name();
		Daughter d = new Daughter();
		d.name();
		Son s = new Son();
		s.name();
		*/
	}
}
