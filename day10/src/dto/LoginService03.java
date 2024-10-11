package dto;

import java.util.Scanner;

public class LoginService03 {
	private LoginDTO03 dto;
	Scanner input = new Scanner(System.in);
	public LoginService03() {
		dto = new LoginDTO03();
	}
	public void loginCheck() {
		if(dto.getId()==null || dto.getPwd() == null ) {
			System.out.println("회원가입 먼저 하세요");
		}else {
			System.out.print("id 입력 : ");
			dto.setInputid(input.next());
			if(dto.getId().equals(dto.getInputid())) {
				System.out.print("pwd 입력 : ");
				dto.setInputpwd(input.next());
				if(dto.getPwd().equals(dto.getInputpwd())) {
					System.out.println("인증 통과");
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("아이디가 틀렸습니다.");
			}
		}
	}
	public void register() {
		if(dto.getId()==null || dto.getPwd() == null) {
			System.out.print("id 입력 : ");
			dto.setInputid(input.next());
			System.out.print("pwd 입력 : ");
			dto.setInputpwd(input.next());
			dto.setId(dto.getInputid());
			dto.setPwd(dto.getInputpwd());
		}else {
			System.out.println("사용자 존재합니다. 탈퇴 후 진행하세요");
		}
	}
	public void deleteMember() {
		if(dto.getId()==null || dto.getPwd() == null) {
			System.out.println("회원가입 먼저 진행하세요");
		}else {
			dto.setId(null);
			dto.setPwd(null);
			System.out.println("회원 삭제!");
		}
	}
	public void display() {
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.println("4. 종료");
			System.out.print(">>>");
			int num = input.nextInt();
			switch(num) {
			case 1:
				loginCheck();
				break;
			case 2:
				register();
				break;
			case 3:
				deleteMember();
				break;
			case 4:
				return;
			}
		}
		
	}
}
