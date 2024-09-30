package if_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		int coffie = 2000;
		Scanner scn = new Scanner(System.in);
		System.out.println("커피 개수 입력");
		int cnt=0;
		int total=0;
		cnt = scn.nextInt();
		if(cnt>10) {
			total = coffie*10 + 1500*(cnt-10);
			System.out.println("커피 금액 : "+ total);
		}else {
			total = coffie*10;
			System.out.println("커피 금액 : "+ total);
		}
	}
}
