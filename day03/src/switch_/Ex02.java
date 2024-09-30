package switch_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String name = null;
		int num =3;
		switch(num) {
		case 1:System.out.println("이름 저장");
			name = "홍길동"; break;
		case 2:System.out.println("출력");
		}
		System.out.println("이름 : " + name);
		
		Scanner input = new Scanner(System.in);
		int i = 0;
		while(true) {
			i++;
			System.out.println(i+"반복문");
			name = input.next();
//			System.out.println("출력 : " + name);
			switch(name) {
				case "홍길동": System.out.println("반갑다"); break;
				default : System.out.println("존재하지 않는다");
			}
		}
	}
}
