package array_;

public class Ex04 {
	public static void main(String[] args) {
		int[][] arr = new int[][]
				{
					{1,2,3,4},
					{10,20,30,40},
					{100,200,300,400}
				};
				System.out.println(arr[0][0]);
				System.out.println(arr[0][1]);
				System.out.println(arr[0][2]);
				
				System.out.println(arr[1][0]);
				System.out.println(arr[1][1]);
				System.out.println(arr[1][2]);
				
				for(int i=0; i<3; i++) { // i < arr.length
//					System.out.println(i);
					for(int k=0; k<4; k++) { // k<arr[i].length
						System.out.print(i+","+k+"=>");
						System.out.println(arr[i][k]);
					}
				}
				System.out.println("arr.length : " + arr.length);
				System.out.println("arr.length : " + arr[0].length);
				
	}
}
