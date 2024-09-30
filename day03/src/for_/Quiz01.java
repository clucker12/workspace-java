package for_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a,i;
		System.out.println("숫자를 입력:");
		a=scn.nextInt();
		for(i=1;i<=a;i++) {
			System.out.println(i+".hello");
		}
	}
}
