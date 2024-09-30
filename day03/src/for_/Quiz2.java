package for_;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum=0,i=0,result=0;
		for(i=1;i<=100;i++) {
			sum+=i;
			if(sum==528) {
				break;
			}
		}
		System.out.println(i);
	}
}
