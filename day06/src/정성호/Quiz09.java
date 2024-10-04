package 정성호;

public class Quiz09 {
	public static void main(String[] args) {
		int sum=0;
		for(int i = 1; i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				sum+=1;
				System.out.print(sum+"\t");
			}
			System.out.println("");
		}
	}
}
