package 정성호.db_common;

import java.util.Scanner;

import 정성호.db_service.DBService;
import 정성호.db_service.DBServiceImpl;

//service는 연산과 출력
//dao는 DB저장
//dto는 데이터 이동 수단

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		DBService st =new DBServiceImpl();
		while(true) {
			System.out.println("1. new st 이동");
			System.out.println("2. 다른 사용자 이동");
			System.out.println("3. 종료");
			num = input.nextInt();
			switch(num) {
			case 1: 
				st.display();
				break;
			case 2: break;
			case 3: break;
			}
		}
	}
}
