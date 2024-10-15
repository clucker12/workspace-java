package thread;

import java.util.Scanner;

class A04 extends Thread{
	public void run() {
		for(;;) {
			System.out.println("내용이 출력됩니다");
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class Ex04 {
	public static void main(String[] args) {
		String msg = null;
		Scanner input = new Scanner(System.in);
		A04 a = new A04();
		a.setDaemon(true);
		a.start();
		while(true) {
			System.out.println("문자열 입력");
			msg = input.next();
			System.out.println("입력한 문자 : " + msg);
			if(msg.equals("end"))
				break;
		}
		
		System.out.println("프로그램 종료");
	}
}
