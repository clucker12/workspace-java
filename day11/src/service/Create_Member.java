package service;

import java.util.Scanner;

import dto.Dto_Member;

public class Create_Member{
	Scanner input = new Scanner(System.in);
	Dto_Member member = new Dto_Member();
	public Create_Member() {
		//display();
	}
	
	
	public void display() {
		String name,id,pwd;
		if(member.getName()==null) {
			System.out.println("이름 입력 : ");
			name = input.next();
			member.setName(name);
			System.out.println("아이디 입력 : ");
			id = input.next();
			member.setId(id);
			System.out.println("비밀번호 입력 : ");
			pwd = input.next();
			member.setPwd(pwd);
		}else {
			System.out.println("회원 등록 불가");
		}
	}
	
	public void display1() {
		String id,pwd;
		boolean log;
		System.out.println("아이디 입력 : ");
		id = input.next();
		System.out.println("비밀번호 입력 : ");
		pwd = input.next();
		System.out.println(member.getId());
		if(id.equals(member.getId()) && pwd.equals(member.getPwd())) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}
}
