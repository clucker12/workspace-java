package 정성호;

import java.util.Arrays;

public class Quiz10 {
	public static void main(String[] args) {
		int[] arr = {4,8,2,7,6};
		int a = 0;
		int[] max = new int[5];
		for(int i=1;i<=arr.length;i++) {
			for(int j=1;j<=arr.length;j++) {
				if(max[arr.length-i]<arr[j-1]) {
					max[arr.length-i] = arr[j-1];
					a=j-1;
				}
				
			}
			arr[a]=0;
		}
		for(int k=1;k<=max.length;k++) {
			System.out.print(max[k-1]);
			if(k<max.length) {
				System.out.print(",");
			}
		}
		/*
		int[] arr = { 4, 8, 2, 7, 6 };
		int tem = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tem = arr[j];
					arr[j] = arr[i];
					arr[i] = tem;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		*/
	}
}
