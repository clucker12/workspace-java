package variable;

import java.util.Scanner;

class QuizTest01 {
	String name, addr;
	int kor,math,eng,sum;
	// 출력 결과, 이름, 주소, 국, 영,수, 합
	
	public void inputData() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		name = input.next();
		addr = "산골짜기";
		kor = 80;
		math = 70;
		eng = 96;
		sumKEM();
		System.out.println("입력 성공");
		
	}
	
	public void printData() {
		System.out.println("-----------모든 값 출력------------");
		System.out.println("이름 :" + name);
		System.out.println("주소 :" + addr);
		System.out.println("국어 :" + kor);
		System.out.println("영어 :" + math);
		System.out.println("수학 :" + eng);
		System.out.println("합 :" + sum);
	}
	private void sumKEM() {
		sum = kor + math + eng;
		System.out.println("합 구함");
	}
}


public class Quiz01 {
	public static void main(String[] args) {
		QuizTest01 t = new QuizTest01();
		t.inputData();
		t.printData();
	}
}
