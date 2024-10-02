package array_;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int arr[] = new int[] {10,54,13,17,25,30};
		   Scanner input = new Scanner(System.in);
		   String odd_even = null;
		   System.out.println("짝, 홀 입력");
		   odd_even = input.next();
		   for(int i=0 ; i<arr.length ; i++) {
		      //System.out.println( i );
		      //System.out.println( i % 2 == 0 );
		      if(  i % 2 == 0 && odd_even.equals("짝") ) {
		         System.out.println( arr[i] );
		      }else if(i % 2 == 1 && odd_even.equals("홀")) {
		         System.out.println( arr[i] );
		      }
		   }
		   System.out.println("---------------");
		   int k;
		   if( odd_even.equals("짝") ) {
		      k = 0;
		   }else {
		      k = 1;
		   }
		   for( ; k < arr.length ; k += 2) {
		      System.out.println( arr[k] );
		   }
		   
		   System.out.println("-------------");
		   //변수 = (식) ? 참 : 거짓;
		   for( k = odd_even.equals("짝")?0:1 ; k < arr.length ; k += 2) {
		      System.out.println( arr[k] );
		   }
		}
		}
