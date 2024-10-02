package array_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		   int arr[] = new int[] {10,54,13,17,25,30};
		   Scanner input = new Scanner(System.in);
		   String odd_even = null;
		   System.out.println("짝, 홀 입력");
		   odd_even = input.next();
		   for(int i = 0 ; i < arr.length ; i++) {
		      if(arr[i] % 2 == 0) {
		         if( odd_even.equals("짝") ) {
		            System.out.println( arr[i] );
		         }
		      }else if(odd_even.equals("홀") && arr[i] % 2 != 0) {
		         System.out.println( arr[i] );
		      }
		   }
		}
		}


