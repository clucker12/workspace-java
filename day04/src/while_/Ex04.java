package while_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int i =0;
		boolean bool = true;
		while(bool) {
			i++;
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("다음 문장들 실행");
		
		Scanner input = new Scanner(System.in);
		String name1,name2;
		System.out.println("1.이름 입력");
		name1 = input.next();
		System.out.println("2.이름 입력");
		name2 = input.next();
		System.out.println("n1==n2 : " + (name1 == name2));
		System.out.println("n1.equls(n2) : " + (name1.equals(name2)));
		
		if(name2.equals(name1)) {
			System.out.println("이름이 같다");
		}else {
			System.out.println("이름이 다르다");
		}
		
		String n1=null,n2="test";
		int n =0;
		
		if(n2.equals(n1)) {
			System.out.println("같다");
		}
		// 단순 null값 비교 => n1 == null
		
	}
}
