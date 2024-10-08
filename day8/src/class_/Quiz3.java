package class_;

import java.util.Scanner;
//입력 받은 값이 3의 배수인지 아닌지 판별
class Multiple{
	public int multipleCheck(int n1) {
		if(n1 % 3 == 0) return 0;
		else return 1;
	}
	public void outPut(int n1,int re) {
		if(re == 0)  System.out.println(n1+"은 3의 배수 입니다 ");
		else  System.out.println(n1+"은 3의 배수가 아닙니다");
	}
}
public class Quiz3 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Multiple mul = new Multiple();
		int num1;
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		int result = mul.multipleCheck(num1);
		mul.outPut(num1,result);
	}

}
