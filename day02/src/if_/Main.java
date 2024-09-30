package if_;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		int ondo;
		String order;
		int count;
		System.out.println("=======================");
		System.out.println("1.아메리카노");
		System.out.println("1.카페라떼");
		System.out.println("=======================");
		System.out.print("메뉴 선택 :");
		menu = sc.nextInt();
		System.out.println("=======================");
		System.out.println("1.ICE");
		System.out.println("2.HOT");
		System.out.println("=======================");
		System.out.print("온도 선택 :");
		ondo = sc.nextInt();
		System.out.print("추가 사항 입력 >>");
		order = sc.next();
		count = sc.nextInt();
		
		if(menu == 1) {
			if(ondo ==1) {
				System.out.println("선택하신 메뉴는 아이스 아메리카노입니다.");
			}
			else {
				System.out.println("선택하신 메뉴는 따듯한 아메리카노입니다");
			}
		}
		else {
			if(ondo ==1) {
				System.out.println("선택하신 메뉴는 아이스 카페라떼입니다.");
			}
			else {
				System.out.println("선택하신 메뉴는 따듯한 카페라떼입니다");
			}
		}
		if(count >= 10) {
			System.out.println("몸에 안좋습니다. 적당히 넣으세요");
		}
		else {
			System.out.println("음료나왔습니다.\r\n"
					+ "맛있게 드세요.");
			
		}
		
	}
}
