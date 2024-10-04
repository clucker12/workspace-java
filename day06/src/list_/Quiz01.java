package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> phone = new ArrayList<String>();
		boolean bool = true;
		Scanner input = new Scanner(System.in);
		int n=0;
		String a=null;
		String b=null;
		
		while(bool) {
			System.out.println("1.연락처 등록");
			System.out.println("2.이름 검색");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>>>>>");
			n=input.nextInt();
			
			switch(n) {
			case 1:
				System.out.print("이름 입력 :");
				a=input.next();
				name.add(a);
				while(true) {
					System.out.print("전화번호 입력 :");
					b=input.next();
					if(phone.contains(b)!=true) {
						phone.add(b);
						break;
					}
					System.out.println("전화 번호 중복");
				}
				break;
			case 2:
				System.out.print("이름 검색 :");
				a=input.next();
				if(name.contains(a)==true) {
					System.out.println("등록된 이름 있음");
					System.out.println("이름 :"+name.get(name.indexOf(a)));
				}else {
					System.out.println("등록된 이름 없음");
				}
				break;
			case 3:
				System.out.print("전화 번호 검색 : ");
				b=input.next();
				if(phone.contains(b)==true) {
					name.remove(phone.indexOf(b));
					phone.remove(phone.indexOf(b));
					System.out.println("연락처 삭제 완료");
				}else {
					System.out.println("등록된 번호 없음");
				}
				break;
			case 4:
				for(int i =0; i<=name.size()-1;i++) {
					System.out.println("회원"+(i+1));
					System.out.println("이름 :" + name.get(i));
					System.out.println("전화번호 :" + phone.get(i));
				}
				break;
			case 5:
				System.out.println("종료");
				bool = false;
			}
		}
	}
}
