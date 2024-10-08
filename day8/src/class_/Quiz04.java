package class_;

import java.util.Scanner;

//수를 입력 받아 소수를 판별하는 함수 제작
class Prime{
	public int primeCheck(int n1) {
		int cnt=0;
		for(int i=1;i<=n1;i++) 
			if(n1 % i == 0 )cnt++;
		return cnt;
	}
	public void outPut(int n1,int re) {
		if(re == 2)  System.out.println(n1+"은 소수 입니다 ");
		else  System.out.println(n1+"은 소수가 아닙니다");
	}
}

public class Quiz04 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Prime prime = new Prime();
		int num1;
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		int result = prime.primeCheck(num1);
		prime.outPut(num1,result);
	}

}