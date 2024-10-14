package inheritance;

import java.util.Scanner;

class Login_Dto{
	String id ="1234";
	String pwd ="1234";
	String id_ch;
	String pwd_ch;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getId_ch() {
		return id_ch;
	}
	public void setId_ch(String id_ch) {
		this.id_ch = id_ch;
	}
	public String getPwd_ch() {
		return pwd_ch;
	}
	public void setPwd_ch(String pwd_ch) {
		this.pwd_ch = pwd_ch;
	}
	
}

class Login extends Aircon{
	String id_ch;
	String pwd_ch;
	Login_Dto dto = new Login_Dto();
	Scanner input = new Scanner(System.in);
	public void display()  {
		System.out.println("로그인 기능");
		System.out.print("id 입력 :");
		id_ch = input.next();
		dto.setId_ch(id_ch);
		System.out.print("pwd 입력 :");
		pwd_ch = input.next();
		dto.setPwd(pwd_ch);
		if(dto.getId().equals(id_ch) && dto.getPwd().equals(pwd_ch)) {
			System.out.println("인증통과");
			super.display();
		}else {
			System.out.println("인증 실패");
		}
		
	}
}

class Aircon {
	public void display() {
		System.out.println("에어컨 동작합니다");
	}
}


public class Ex10 {
	public static void main(String[] args) {
		Login air = new Login();
		air.display();
	}
}
