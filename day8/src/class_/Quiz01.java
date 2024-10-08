package class_;

import java.util.Scanner;

class Big{
	public int[] myInput() {
		Scanner input = new Scanner(System.in);
		int num1,num2;
		System.out.print("첫번째 값 입력 : ");
		num1 = input.nextInt();
		System.out.print("두번째 값 입력 : ");
		num2 = input.nextInt();
		int [] arr = {num1, num2};
		return arr;
	}
	public int big(int n1,int n2) {
		if(n1 > n2) return n1;
		else return n2;
	}
	public void outPut(int n1,int n2,int re) {
		System.out.println(n1+"과"+n2+"중 큰수 : "+re);
	}
}
public class Quiz01 {
	public static void main(String [] args){
		Big b = new Big();
		int[] n = b.myInput();
		int result = b.big(n[0], n[1]);
		b.outPut(n[0], n[1],result);
	}
}
