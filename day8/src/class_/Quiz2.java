package class_;

import java.util.Scanner;
//입력 받은 값이 짝수인지 홀수인지 판별하는 함수 제작

class OddEven{
	public int myInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		return input.nextInt();
	}
	public int oddEven(int n1) {
		if(n1 % 2 == 0) return 0;
		else return 1;
	}
	public void outPut(int n1,int re) {
		if(re == 0)  System.out.println(n1+"은 '짝' 수 입니다 : ");
		else  System.out.println(n1+"은 '홀' 수 입니다 : ");
	}
}

public class Quiz2 {
	public static void main(String [] args){
		
		OddEven oe = new OddEven();
		int num1 = oe.myInput();
		int result = oe.oddEven(num1);
		oe.outPut(num1,result);
	}

}