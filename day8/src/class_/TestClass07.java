package class_;

import java.util.Scanner;

public class TestClass07 {
	public void sumFunc(int num) {
		System.out.println("07");
		int sum =0;
		for(int i =1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("1~ " + num + " : " + sum);
	}
}
